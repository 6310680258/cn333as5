package com.example.mynotes.domain.model

import androidx.room.ColumnInfo
import androidx.room.PrimaryKey

const val NEW_NOTE_ID = -1L

data class NoteModel(
    val id: Long = NEW_NOTE_ID, // This value is used for new notes
    val name: String = "",
    val phoneNumber: String = "",
    val tag: String = "",
    val color: ColorModel = ColorModel.DEFAULT
)

