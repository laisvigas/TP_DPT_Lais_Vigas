package CesaeResort.Models;

//id,num_quarto,id_cliente,ano,mes,semana
public class Reservas {
    private String idReserva;
    private int numQuarto;
    private String idCliente;
    private int ano;
    private int mes;
    private int semana;

    public Reservas(String idReserva, int numQuarto, String idCliente, int ano, int mes, int semana) {
        this.idReserva = idReserva;
        this.numQuarto = numQuarto;
        this.idCliente = idCliente;
        this.ano = ano;
        this.mes = mes;
        this.semana = semana;
    }

    public String getIdReserva() {
        return idReserva;
    }

    public int getNumQuarto() {
        return numQuarto;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public int getAno() {
        return ano;
    }

    public int getMes() {
        return mes;
    }

    public int getSemana() {
        return semana;
    }
}
