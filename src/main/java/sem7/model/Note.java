package sem7.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Note {
    private String id = "";
    private String noteHead;
    private String noteText;
    private String noteDate;
    DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
    public Note(String noteHead, String noteText) {
        this.noteHead = noteHead;
        this.noteText = noteText;
        noteDate = dateFormat.format(new Date());
    }
    public Note(String id, String noteHead, String noteText) {
        this(noteHead, noteText);
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNoteHead() {
        return noteHead;
    }
    public void setNoteHead(String noteHead) {
        this.noteHead = noteHead;
    }
    public String getNoteText() {
        return noteText;
    }
    public void setNoteText(String noteText) {
        this.noteText = noteText;
    }
    public String getNoteDate() {
        return noteDate;
    }
    public void setNoteDate(String noteDate) {
        this.noteDate = noteDate;
    }
    @Override
    public String toString() {
        return "Note{" +
                "id='" + id + '\'' +
                ", noteHead='" + noteHead + '\'' +
                ", noteText='" + noteText + '\'' +
                ", noteDate='" + noteDate + '\'' +
                '}';
    }
}
