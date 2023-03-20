package sem7.model;

public class UserMapper implements Mapper {
    @Override
    public String map(Note note) {
        return String.format("%s,%s,%s,%s", note.getId(), note.getNoteHead(), note.getNoteText(), note.getNoteDate());
    }

    @Override
    public Note map(String line) {
        String[] lines = line.split(",");
        return new Note(lines[0], lines[1], lines[2]);
    }
}