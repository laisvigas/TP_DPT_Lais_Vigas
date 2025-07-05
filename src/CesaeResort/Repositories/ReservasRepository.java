package CesaeResort.Repositories;
import CesaeResort.Models.Ratings;
import CesaeResort.Models.Reservas;
import CesaeResort.Tools.CSVFileReader;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ReservasRepository {
    private ArrayList<Reservas> reservasArray;

    public ReservasRepository() throws FileNotFoundException {
        CSVFileReader csvFR = new CSVFileReader();

        this.reservasArray = csvFR.reservasFileReader("Files/reservas_quartos.csv");
    }

    public ArrayList<Reservas> getReservasArray() {
        return reservasArray;
    }
}
