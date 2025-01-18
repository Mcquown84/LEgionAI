import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface WalletDao {
    @Query("SELECT * FROM wallet")
    fun getWallet(): Wallet

    @Insert
    suspend fun insertWallet(wallet: Wallet)

    @Update
    suspend fun updateWallet(wallet: Wallet)
}