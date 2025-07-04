package CesaeResort.Models;

public class Quarto {
    private int num_quarto;
    private int id_tipologia;

    public Quarto(int num_quarto, int id_tipologia) {
        this.num_quarto = num_quarto;
        this.id_tipologia = id_tipologia;
    }

    public int getNum_quarto() {
        return num_quarto;
    }

    public int getId_tipologia() {
        return id_tipologia;
    }

    @Override
    public String toString() {
        return    "num_quarto=" + num_quarto +
                "| id_tipologia=" + id_tipologia +
                '\n';
    }
}
