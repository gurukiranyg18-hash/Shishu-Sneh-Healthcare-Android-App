package com.shishusneh.repository

import androidx.lifecycle.LiveData
import com.shishusneh.data.Baby
import com.shishusneh.data.BabyDao

class BabyRepository(private val dao: BabyDao) {

    val allBabies: LiveData<List<Baby>> =
        dao.getAllBabies()

    suspend fun insertBaby(baby: Baby) {
        dao.insertBaby(baby)
    }
}
