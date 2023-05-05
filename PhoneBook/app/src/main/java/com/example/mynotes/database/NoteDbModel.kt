package com.example.mynotes.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class NoteDbModel(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "phoneNumber") val phoneNumber: String,
    @ColumnInfo(name = "tag") val tag: String,
    @ColumnInfo(name = "color_id") val colorId: Long,
    @ColumnInfo(name = "in_trash") val isInTrash: Boolean
) {
    companion object {
        val DEFAULT_NOTES = listOf(
            NoteDbModel(1, "Ananda", "+66812233444", "family",2,false),
            NoteDbModel(2, "Brown", "+66945678915", "friend", 3, false),
            NoteDbModel(3, "Chavie", "+66834567892", "work", 4, true),
            NoteDbModel(4, "Decha", "+66800938477", "work", 9, false),
            NoteDbModel(5, "Fah", "+66911112222", "work", 12, true),
        )
    }
}
