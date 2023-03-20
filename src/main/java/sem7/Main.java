package sem7;

import sem7.model.*;
import sem7.view.ViewUser;
import sem7.controllers.NoteController;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("notes.txt");
        Repository repository = new RepositoryFile(fileOperation, new UserMapper());
        NoteController controller = new NoteController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}
