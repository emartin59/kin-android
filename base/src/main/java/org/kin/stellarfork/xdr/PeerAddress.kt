// Automatically generated by xdrgen 
// DO NOT EDIT or your changes may be overwritten
package org.kin.stellarfork.xdr

import org.kin.stellarfork.xdr.IPAddrType
import java.io.IOException

// === xdr source ============================================================
//  struct PeerAddress
//  {
//      union switch (IPAddrType type)
//      {
//      case IPv4:
//          opaque ipv4[4];
//      case IPv6:
//          opaque ipv6[16];
//      }
//      ip;
//      uint32 port;
//      uint32 numFailures;
//  };
//  ===========================================================================
class PeerAddress {
    var ip: PeerAddressIp? = null
    var port: Uint32? = null
    var numFailures: Uint32? = null

    class PeerAddressIp {
        var discriminant: IPAddrType? = null
        var ipv4: ByteArray? = null
        var ipv6: ByteArray?  = null

        companion object {
            @JvmStatic
            @Throws(IOException::class)
            fun encode(
                stream: XdrDataOutputStream,
                encodedPeerAddressIp: PeerAddressIp
            ) {
                stream.writeInt(encodedPeerAddressIp.discriminant!!.value)
                when (encodedPeerAddressIp.discriminant) {
                    IPAddrType.IPv4 -> {
                        val ipv4size = encodedPeerAddressIp.ipv4!!.size
                        stream.write(encodedPeerAddressIp.ipv4!!, 0, ipv4size)
                    }
                    IPAddrType.IPv6 -> {
                        val ipv6size = encodedPeerAddressIp.ipv6!!.size
                        stream.write(encodedPeerAddressIp.ipv6!!, 0, ipv6size)
                    }
                }
            }

            @JvmStatic
            @Throws(IOException::class)
            fun decode(stream: XdrDataInputStream): PeerAddressIp {
                val decodedPeerAddressIp = PeerAddressIp()
                val discriminant = IPAddrType.decode(stream)
                decodedPeerAddressIp.discriminant = discriminant
                when (decodedPeerAddressIp.discriminant) {
                    IPAddrType.IPv4 -> {
                        val ipv4size = 4
                        decodedPeerAddressIp.ipv4 = ByteArray(ipv4size)
                        stream.read(decodedPeerAddressIp.ipv4!!, 0, ipv4size)
                    }
                    IPAddrType.IPv6 -> {
                        val ipv6size = 16
                        decodedPeerAddressIp.ipv6 = ByteArray(ipv6size)
                        stream.read(decodedPeerAddressIp.ipv6!!, 0, ipv6size)
                    }
                }
                return decodedPeerAddressIp
            }
        }
    }

    companion object {
        @JvmStatic
        @Throws(IOException::class)
        fun encode(stream: XdrDataOutputStream, encodedPeerAddress: PeerAddress) {
            PeerAddressIp.encode(stream, encodedPeerAddress.ip!!)
            Uint32.encode(stream, encodedPeerAddress.port!!)
            Uint32.encode(stream, encodedPeerAddress.numFailures!!)
        }

        @JvmStatic
        @Throws(IOException::class)
        fun decode(stream: XdrDataInputStream): PeerAddress {
            val decodedPeerAddress = PeerAddress()
            decodedPeerAddress.ip = PeerAddressIp.decode(stream)
            decodedPeerAddress.port = Uint32.decode(stream)
            decodedPeerAddress.numFailures = Uint32.decode(stream)
            return decodedPeerAddress
        }
    }
}