// Automatically generated by xdrgen 
// DO NOT EDIT or your changes may be overwritten
package org.kin.stellarfork.xdr

import java.io.IOException

// === xdr source ============================================================
//  enum AccountFlags
//  { // masks for each flag
//
//      // Flags set on issuer accounts
//      // TrustLines are created with authorized set to "false" requiring
//      // the issuer to set it for each TrustLine
//      AUTH_REQUIRED_FLAG = 0x1,
//      // If set, the authorized flag in TrustLines can be cleared
//      // otherwise, authorization cannot be revoked
//      AUTH_REVOCABLE_FLAG = 0x2,
//      // Once set, causes all AUTH_* flags to be read-only
//      AUTH_IMMUTABLE_FLAG = 0x4
//  };
//  ===========================================================================
enum class AccountFlags(val value: Int) {
    AUTH_REQUIRED_FLAG(1),
    AUTH_REVOCABLE_FLAG(2),
    AUTH_IMMUTABLE_FLAG(4);

    companion object {
        @JvmStatic
        @Throws(IOException::class)
        fun decode(stream: XdrDataInputStream): AccountFlags {
            val value = stream.readInt()
            return when (value) {
                1 -> AUTH_REQUIRED_FLAG
                2 -> AUTH_REVOCABLE_FLAG
                4 -> AUTH_IMMUTABLE_FLAG
                else -> throw RuntimeException("Unknown enum value: $value")
            }
        }

        @JvmStatic
        @Throws(IOException::class)
        fun encode(stream: XdrDataOutputStream, value: AccountFlags) {
            stream.writeInt(value.value)
        }
    }

}