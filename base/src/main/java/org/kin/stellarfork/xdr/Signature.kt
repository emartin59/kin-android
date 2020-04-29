// Automatically generated by xdrgen 
// DO NOT EDIT or your changes may be overwritten
package org.kin.stellarfork.xdr

import java.io.IOException

// === xdr source ============================================================
//  typedef opaque Signature<64>;
//  ===========================================================================
class Signature {
    var signature: ByteArray? = null

    companion object {
        @JvmStatic
        @Throws(IOException::class)
        fun encode(
            stream: XdrDataOutputStream,
            encodedSignature: Signature
        ) {
            val Signaturesize = encodedSignature.signature!!.size
            stream.writeInt(Signaturesize)
            stream.write(encodedSignature.signature!!, 0, Signaturesize)
        }

        @JvmStatic
        @Throws(IOException::class)
        fun decode(stream: XdrDataInputStream): Signature {
            val decodedSignature = Signature()
            val Signaturesize = stream.readInt()
            decodedSignature.signature = ByteArray(Signaturesize)
            stream.read(decodedSignature.signature!!, 0, Signaturesize)
            return decodedSignature
        }
    }
}