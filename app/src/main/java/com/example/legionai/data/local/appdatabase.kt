// app/src/main/java/com/example/legionai/data/local/AppDatabase.kt
package com.example.legionai.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.legionai.data.models.Trade
import com.example.legionai.data.models.Wallet

@Database(entities = [Trade::class, Wallet::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun tradeDao(): TradeDao
    abstract fun walletDao(): WalletDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "trading_bot_db"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}