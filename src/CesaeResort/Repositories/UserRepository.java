package CesaeResort.Repositories;
import CesaeResort.Models.User;
import CesaeResort.Tools.CSVFileReader;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class UserRepository {
    private ArrayList<User> userArray;

    public UserRepository() throws FileNotFoundException {
        CSVFileReader csvFR = new CSVFileReader();

        this.userArray= csvFR.usersFileReader("Files/logins.csv");
    }

    public ArrayList<User> getUserArray() {
        return userArray;
    }
}
