package CesaeResort.Controllers;

import CesaeResort.Models.Experiencia;
import CesaeResort.Models.Quarto;
import CesaeResort.Models.Ratings;
import CesaeResort.Models.Tipologia;
import CesaeResort.Repositories.ExperienciaRepository;
import CesaeResort.Repositories.QuartosRepository;
import CesaeResort.Repositories.RatingsRepository;
import CesaeResort.Repositories.TipologiaRepository;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ClientController {
    private QuartosRepository quartosRepository;
    private TipologiaRepository tipologiaRepository;
    private ExperienciaRepository experienciaRepository;
    private RatingsRepository ratingsRepository;

    public ClientController() throws FileNotFoundException {
        this.quartosRepository = new QuartosRepository();
        this.tipologiaRepository = new TipologiaRepository();
        this.experienciaRepository = new ExperienciaRepository();
        this.ratingsRepository = new RatingsRepository();
    }

    public ArrayList<Quarto> consultarQuartos(){
        return quartosRepository.getQuartosArray();
    }

    public ArrayList<Tipologia> consultarTipologia(){
        return tipologiaRepository.getTipologiaArray();
    }

    public ArrayList<Experiencia> consultarExperiencias(){
        return experienciaRepository.getExperienciaArray();
    }


    public int highestRating() {

        int maiorRating = 0;

        for (Ratings ratingAtual : this.ratingsRepository.getRatingsArray()) {
            if (ratingAtual.getRatingExperiencia() > maiorRating){
                maiorRating = ratingAtual.getRatingExperiencia();
            }
        }
        return maiorRating;
    }

    public String expTopSeller(){
        return "";
    }

    public String avaliarExp(){
        return "";
    }
}
