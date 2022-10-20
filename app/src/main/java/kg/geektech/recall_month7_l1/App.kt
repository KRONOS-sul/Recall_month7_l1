package kg.geektech.recall_month7_l1

import android.app.Application
import androidx.room.Room
import dagger.hilt.android.HiltAndroidApp
import kg.geektech.recall_month7_l1.data.localdb.NoteDatabase

@HiltAndroidApp
class App : Application() {

    companion object {
        lateinit var roomNoteDatabase: NoteDatabase
    }

    override fun onCreate() {
        super.onCreate()
        roomNoteDatabase = Room.databaseBuilder(
            applicationContext,
            NoteDatabase::class.java,
            "note_db"
        ).allowMainThreadQueries()  //для того чтобы не блокировать главный поток, нужен только когда используем корутины
            .build()
    }
}