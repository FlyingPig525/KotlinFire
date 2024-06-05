package io.github.flyingpig525.encoding

import java.io.ByteArrayOutputStream
import java.nio.charset.StandardCharsets.UTF_8
import java.util.zip.GZIPInputStream
import java.util.zip.GZIPOutputStream

object Gzip : Encoding {
    override fun encode(input: String): ByteArray {
        val bos = ByteArrayOutputStream()
        GZIPOutputStream(bos).bufferedWriter(UTF_8).use { it.write(input) }
        return bos.toByteArray()
    }

    override fun decode(input: ByteArray): String =
        GZIPInputStream(input.inputStream()).bufferedReader(UTF_8).use { it.readText() }
}