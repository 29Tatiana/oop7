package sem7.controllers;

import sem7.model.Fields;
import sem7.model.Note;
import sem7.model.Repository;

import java.util.List;

public class NoteController {
    private final Repository repository;
    public NoteController(Repository repository) {
        this.repository = repository;
    }
    public void saveUser(Note note) throws Exception {
        repository.CreateNote(note);
    }
    public void updateNote(Note note, String field, String param) throws Exception{
        repository.updateNote(note, field, param);
    }
    public Note readUser(String userId) throws Exception {
        List<Note> notes = repository.getAllNotes();
        for (Note note : notes) {
            if (note.getId().equals(userId)) {
                return note;
            }
        }
        throw new Exception("User not found");
    }
    public List<Note> getNotes() {
        return repository.getAllNotes();
    }
    public void deleteUser(String userId) {
        repository.deleteUser(userId);
    }
    public Note getNoteById(String noteId) throws Exception{
        List<Note> notes = repository.getAllNotes();
        Note noteFind = null;
        for (Note note : notes) {
            if (note.getId().equals(noteId)) {
                noteFind = note;
                break;
            }
        }
        return noteFind;
    }
    public void noteUpdate(Note updatedNote) {
        List<Note> notes = repository.getAllNotes();
        Note noteToBeUpdated = notes.stream().filter(p -> p.getId().equals(updatedNote.getId())).findFirst().orElse(null);
        if (noteToBeUpdated != null) {
            noteToBeUpdated.setNoteHead(updatedNote.getNoteHead());
            noteToBeUpdated.setNoteText(updatedNote.getNoteText());
            repository.saveRepository(notes);
        } else System.out.println("Заметка с идентификатором: " + updatedNote.getId() + " не найдена");
    }
}
