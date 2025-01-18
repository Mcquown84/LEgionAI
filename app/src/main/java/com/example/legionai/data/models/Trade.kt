// app/src/main/java/com/example/legionai/data/models/Trade.kt
package com.example.legionai.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "trades")
data class Trade(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val symbol: String,
    val amount: Double,
    val price: Double,
    val type: TradeType,
    val timestamp: Long = System.currentTimeMillis()
)

enum class TradeType {
    BUY, SELL
}