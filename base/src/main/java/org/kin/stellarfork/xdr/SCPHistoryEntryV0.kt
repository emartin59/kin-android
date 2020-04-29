// Automatically generated by xdrgen 
// DO NOT EDIT or your changes may be overwritten
package org.kin.stellarfork.xdr

import java.io.IOException

// === xdr source ============================================================
//  struct SCPHistoryEntryV0
//  {
//      SCPQuorumSet quorumSets<>; // additional quorum sets used by ledgerMessages
//      LedgerSCPMessages ledgerMessages;
//  };
//  ===========================================================================
class SCPHistoryEntryV0 {
    var quorumSets: Array<SCPQuorumSet?> = arrayOfNulls(0)
    var ledgerMessages: LedgerSCPMessages? = null

    companion object {
        @JvmStatic
        @Throws(IOException::class)
        fun encode(
            stream: XdrDataOutputStream,
            encodedSCPHistoryEntryV0: SCPHistoryEntryV0
        ) {
            val quorumSetssize = encodedSCPHistoryEntryV0.quorumSets.size
            stream.writeInt(quorumSetssize)
            for (i in 0 until quorumSetssize) {
                SCPQuorumSet.encode(stream, encodedSCPHistoryEntryV0.quorumSets[i])
            }
            LedgerSCPMessages.encode(stream, encodedSCPHistoryEntryV0.ledgerMessages!!)
        }

        @JvmStatic
        @Throws(IOException::class)
        fun decode(stream: XdrDataInputStream): SCPHistoryEntryV0 {
            val decodedSCPHistoryEntryV0 = SCPHistoryEntryV0()
            val quorumSetssize = stream.readInt()
            decodedSCPHistoryEntryV0.quorumSets = arrayOfNulls(quorumSetssize)
            for (i in 0 until quorumSetssize) {
                decodedSCPHistoryEntryV0.quorumSets[i] = SCPQuorumSet.decode(stream)
            }
            decodedSCPHistoryEntryV0.ledgerMessages = LedgerSCPMessages.decode(stream)
            return decodedSCPHistoryEntryV0
        }
    }
}