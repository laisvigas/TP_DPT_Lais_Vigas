package CesaeResort.Models;

// id,id_experiencia,rating_experiencia,rating_guia
public class Ratings {
    private String idRating;
    public String idExperiencia;
    public int ratingExperiencia;
    public int ratingGuia;

    public Ratings(String idRating, String idExperiencia, int ratingExperiencia, int ratingGuia) {
        this.idRating = idRating;
        this.idExperiencia = idExperiencia;
        this.ratingExperiencia = ratingExperiencia;
        this.ratingGuia = ratingGuia;
    }

    public int getRatingExperiencia() {
        return ratingExperiencia;
    }

    public String getIdExperiencia() {
        return idExperiencia;
    }
}
