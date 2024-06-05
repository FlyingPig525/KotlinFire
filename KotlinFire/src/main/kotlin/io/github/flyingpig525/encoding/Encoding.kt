package io.github.flyingpig525.encoding

interface Encoding {
    fun encode(input: String): ByteArray
    fun decode(input: ByteArray): String
}