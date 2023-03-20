package sem7.model;

import java.util.regex.Pattern;

public class Validate {
    private Pattern patternName = Pattern.compile("^\\S*$");
    private Pattern patternPhone = Pattern.compile("^\\d*$");
    public void check(Note note) throws Exception {
        if (!patternName.matcher(note.getNoteHead()).find()){
            throw new Exception("invalid first name");
        }
        if (!patternName.matcher(note.getNoteText()).find()){
            throw new Exception("invalid last name");
        }
        if (!patternPhone.matcher(note.getNoteDate()).find()){
            throw new Exception("invalid Phone");
        }
    }
}
