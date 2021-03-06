[kin-android](../../index.md) / [kin.sdk](../index.md) / [KinClient](index.md) / [importAccount](./import-account.md)

# importAccount

`@NonNull open fun importAccount(@NonNull exportedJson: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @NonNull passphrase: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`KinAccount`](../-kin-account/index.md)

Import an account from a JSON-formatted string.

### Parameters

`exportedJson` - [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html): The exported JSON-formatted string.

`passphrase` - [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html): The passphrase to decrypt the secret key.

**Return**
[KinAccount](../-kin-account/index.md): The imported account

