package sem7.model;

public interface Mapper {
    public String map(Note note);
    public Note map(String line);
}