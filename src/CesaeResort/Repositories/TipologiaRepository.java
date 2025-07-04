package CesaeResort.Repositories;
import CesaeResort.Models.Tipologia;
import CesaeResort.Tools.CSVFileReader;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class TipologiaRepository {
    private ArrayList<Tipologia> tipologiaArray;

    public TipologiaRepository() throws FileNotFoundException {
        CSVFileReader csvFR = new CSVFileReader();

        this.tipologiaArray = csvFR.tipologiaFileReader("Files/tipologia.csv");
    }

    public ArrayList<Tipologia> getTipologiaArray() {
        return tipologiaArray;
    }
}
