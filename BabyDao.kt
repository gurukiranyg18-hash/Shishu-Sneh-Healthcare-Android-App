package com.shishusneh.data

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface BabyDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertBaby(baby: Baby)

    @Query("SELECT * FROM baby_table")
    fun getAllBabies(): LiveData<List<Baby>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertVaccine(vaccine: Vaccine)

    @Query("SELECT * FROM vaccine_table")
    fun getVaccines(): LiveData<List<Vaccine>>
}
