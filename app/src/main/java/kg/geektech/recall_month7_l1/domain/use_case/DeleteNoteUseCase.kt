package kg.geektech.recall_month7_l1.domain.use_case

import kg.geektech.recall_month7_l1.domain.model.Note
import kg.geektech.recall_month7_l1.domain.repository.NoteRepository

class CreateNoteUseCase(
    private val noteRepository: NoteRepository
) {                     // Т.к. domain независимый, используем Класс из Domain'а
    fun createNote(note: Note) = noteRepository.createNote(note)

}