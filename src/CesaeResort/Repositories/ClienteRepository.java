package CesaeResort.Repositories;

import CesaeResort.Models.Client;
import CesaeResort.Models.Experiencia;
import CesaeResort.Tools.CSVFileReader;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ClienteRepository {
    private ArrayList<Client> clienteArray;

    public ClienteRepository() throws FileNotFoundException {
        CSVFileReader csvFR = new CSVFileReader();

        this.clienteArray = csvFR.clienteFileReader("Files/clientes.csv");
    }

    public ArrayList<Client> getClientesArray() {
        return clienteArray;
    }
}
