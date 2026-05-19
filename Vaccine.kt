package com.shishusneh.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "vaccine_table")
data class Vaccine(

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    val vaccineName: String,
    val dueDate: String,
    val disease: String
)
