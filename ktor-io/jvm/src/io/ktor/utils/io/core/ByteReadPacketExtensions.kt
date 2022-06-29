@file:Suppress("FunctionName")

package io.ktor.utils.io.core

import io.ktor.utils.io.core.internal.*
import io.ktor.utils.io.pool.*
import java.nio.*

public actual inline fun ByteReadPacket(
    array: ByteArray,
    offset: Int,
    length: Int,
    crossinline block: (ByteArray) -> Unit
): ByteReadPacket {
    return ByteReadPacket(ByteBuffer.wrap(array, offset, length)) { block(array) }
}

public fun ByteReadPacket(bb: ByteBuffer, release: (ByteBuffer) -> Unit = {}): ByteReadPacket {
    TODO()
}
