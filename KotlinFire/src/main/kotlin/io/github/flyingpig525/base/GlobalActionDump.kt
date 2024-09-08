package io.github.flyingpig525.base

import io.github.flyingpig525.base.block.Block
import io.github.flyingpig525.base.item.Item
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.*
import io.ktor.client.engine.java.*
import io.ktor.client.request.*
import io.ktor.http.*
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.json.*

object GlobalActionDump {
    private var actionDumpBlocks: JsonArray? = null

    // no idea why my github website is claycoin.me
    const val ACTIONDUMP_URL = "http://claycoin.me/actiondump.json"

    init {
        runBlocking {
            val get = HttpClient(Java) {
                engine {
                    protocolVersion = java.net.http.HttpClient.Version.HTTP_2
                }
            }.get(ACTIONDUMP_URL) {
                headers {
                    append(HttpHeaders.Accept, "text/json")
                }
            }.body<String>()
            actionDumpBlocks = Json.parseToJsonElement(get).jsonObject["actions"]?.jsonArray
        }
    }

    //_parseTags(type, blockType="player_action"){
    //        const blockData = actions[type];
    //        if (!blockData) return [];
    //        const tags = [];
    //        for (let i = 0; i < blockData.tags.length; i++)
    //        {
    //            const tag = blockData.tags[i]
    //            tags.push({
    //                item: {
    //                    id: 'bl_tag',
    //                    data: {
    //                        tag: tag.name,
    //                        option: tag.defaultOption,
    //                        action: type,
    //                        block: blockType
    //                    }
    //                },
    //                slot: 26-i
    //            })
    //        }
    //
    //        return tags;
    //    }
    fun <T> getTags(block: Block<T>): String where T : Item, T : JsonData {
        var ret = ""
        val tags = actionDumpBlocks?.find {
            it.jsonObject["name"]?.jsonPrimitive?.content == block.action
        }?.jsonObject?.get("tags")?.jsonArray
        if (tags != null) {
            for ((i, el) in tags.withIndex()) {
                ret += """
                    {
                    "item": {
                        "id": "bl_tag",
                        "data": {
                            "tag": "${el.jsonObject["name"]?.jsonPrimitive?.content}",
                            "option": "${el.jsonObject["defaultOption"]?.jsonPrimitive?.content}",
                            "action": "${block.action}",
                            "block": "${block.codeBlock}"
                        }
                    },
                    "slot": ${26 - i}
                    }${if (i != tags.size-1) "," else ""}
                """.trimIndent()
            }
        }
        return ret
    }
    fun tagAmount(tags: String) = tags.count { it == ',' }

}