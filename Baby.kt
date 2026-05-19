package com.shishusneh.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "baby_table")
data class Baby(

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    val name: String,
    val dob: String,
    val weight: Float,
    val height: Float
)
