package kg.geektech.recall_month7_l1.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes")
data class NoteEntity {
    @PrimaryKey(autoGenerate = true)
    val id: Int
    val sd: String
    val text: String
}