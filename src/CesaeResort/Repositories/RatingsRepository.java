package CesaeResort.Repositories;
import CesaeResort.Models.Ratings;
import CesaeResort.Tools.CSVFileReader;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class RatingsRepository {
    private ArrayList<Ratings> ratingsArray;

    public RatingsRepository() throws FileNotFoundException {
        CSVFileReader csvFR = new CSVFileReader();

        this.ratingsArray = csvFR.ratingsFileReader("Files/ratings_experiencias.csv");
    }

    public ArrayList<Ratings> getRatingsArray() {
        return ratingsArray;
    }
}
