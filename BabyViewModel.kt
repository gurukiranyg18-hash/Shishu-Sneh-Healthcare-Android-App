package com.shishusneh.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.shishusneh.data.AppDatabase
import com.shishusneh.data.Baby
import com.shishusneh.repository.BabyRepository
import kotlinx.coroutines.launch

class BabyViewModel(application: Application)
    : AndroidViewModel(application) {

    private val repository: BabyRepository

    val allBabies

    init {

        val dao = AppDatabase
            .getDatabase(application)
            .babyDao()

        repository = BabyRepository(dao)

        allBabies = repository.allBabies
    }

    fun insertBaby(baby: Baby) =
        viewModelScope.launch {

            repository.insertBaby(baby)
        }
}
