package CesaeResort.Repositories;
import CesaeResort.Models.Experiencia;
import CesaeResort.Tools.CSVFileReader;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ExperienciaRepository {
    private ArrayList<Experiencia> experienciaArray;

    public ExperienciaRepository() throws FileNotFoundException {
        CSVFileReader csvFR = new CSVFileReader();

        this.experienciaArray = csvFR.experienciaFileReader("Files/experiencias.csv");
    }

    public ArrayList<Experiencia> getExperienciaArray() {
        return experienciaArray;
    }
}
