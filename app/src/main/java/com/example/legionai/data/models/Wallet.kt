// app/src/main/java/com/example/legionai/data/models/Wallet.kt
package com.example.legionai.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wallets")
data class Wallet(
    @PrimaryKey
    val address: String,
    val encryptedPrivateKey: String,
    val balance: Double = 0.0,
    val allocatedForTrading: Double = 0.0
)