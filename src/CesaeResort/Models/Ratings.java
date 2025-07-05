package CesaeResort.Models;

// id,id_experiencia,rating_experiencia,rating_guia
public class Ratings {
    private String idRating;
    private String idExperiencia;
    private int ratingExperiencia;
    private int ratingGuia;

    public Ratings(String idRating, String idExperiencia, int ratingExperiencia, int ratingGuia) {
        this.idRating = idRating;
        this.idExperiencia = idExperiencia;
        this.ratingExperiencia = ratingExperiencia;
        this.ratingGuia = ratingGuia;
    }

    public String getIdRating() {
        return idRating;
    }

    public String getIdExperiencia() {
        return idExperiencia;
    }

    public int getRatingExperiencia() {
        return ratingExperiencia;
    }

    public int getRatingGuia() {
        return ratingGuia;
    }
}
