package com.example.phonebook.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class NoteDbModel(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "content") val content: String,
    @ColumnInfo(name = "can_be_checked_off") val canBeCheckedOff: Boolean,
    @ColumnInfo(name = "is_checked_off") val isCheckedOff: Boolean,
    @ColumnInfo(name = "tag_id") val tagId: Long,
    @ColumnInfo(name = "in_trash") val isInTrash: Boolean
) {
    companion object {
        val DEFAULT_NOTES = listOf(
            NoteDbModel(1, "Solar", "099 999 999", false, false, 1, false),
            NoteDbModel(2, "Bills", "011 999 999", false, false, 2, false),
            NoteDbModel(3, "Sun", "092 999 999", false, false, 3, false),
            NoteDbModel(4, "Bob", "094 999 999", false, false, 2, false),
            NoteDbModel(5, "Loren", "095 999 999", false, false, 4, false),
            NoteDbModel(6, "Adam", "059 999 999", false, false, 1, false),
        )
    }
}
