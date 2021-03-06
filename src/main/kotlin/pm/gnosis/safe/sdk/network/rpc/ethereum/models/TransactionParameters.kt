package pm.gnosis.safe.sdk.network.rpc.ethereum.models

import java.math.BigInteger

data class TransactionParameters(
    val gas: BigInteger,
    val gasPrice: BigInteger,
    val nonce: BigInteger
)
