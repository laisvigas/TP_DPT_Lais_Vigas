package CesaeResort.Controllers;
import CesaeResort.Models.Experiencia;
import CesaeResort.Models.Ratings;
import CesaeResort.Repositories.ExperienciaRepository;
import CesaeResort.Repositories.RatingsRepository;
import java.util.ArrayList;
import java.util.List;
import java.io.FileNotFoundException;

// Método implementado: experienciaTopSeller()

public class ClientController {
    private ExperienciaRepository experienciaRepository;
    private RatingsRepository ratingsRepository;

    public ClientController() throws FileNotFoundException {
        this.experienciaRepository = new ExperienciaRepository();
        this.ratingsRepository = new RatingsRepository();
    }

    /**
     * Consulta e retorna a lista de quartos disponíveis.
     * Cada item contém: número do quarto, tipologia e preço por semana.
     *
     * @return Lista de strings formatadas com os dados dos quartos disponíveis
     */
    public List<String> consultarQuartos() {
        // TODO: Implementar lógica para buscar quartos disponíveis
        System.out.println("\nMÉTODO A SER IMPLEMENTADO");
        return new ArrayList<>();
    }

    /**
     * Consulta e retorna a lista de experiências disponíveis.
     * Cada item contém: nome da experiência, rating da experiência,
     * nome do guia, rating do guia, preço para adulto e criança.
     *
     * @return Lista de strings formatadas com os dados das experiências disponíveis
     */
    public List<String> consultarExperiencias() {
        // TODO: Implementar lógica para listar experiências disponíveis
        System.out.println("\nMÉTODO A SER IMPLEMENTADO");
        return new ArrayList<>();
    }

    /**
     * Consulta e retorna a(s) experiência(s) com o maior rating médio.
     * Pode haver mais de uma experiência favorita em caso de empate.
     *
     * @return Lista de strings com os dados das experiências com melhor avaliação
     */
    public List<String> experienciaFavorita() {
        // TODO: Implementar lógica para encontrar todas as experiências com maior rating médio
        System.out.println("\nMÉTODO A SER IMPLEMENTADO");
        return new ArrayList<>();
    }

    /**
     * Consulta e retorna a(s) experiência(s) com mais bilhetes vendidos.
     * Pode haver mais de uma experiência top-seller em caso de empate.
     *
     * @return String com os dados da experiência top-seller
     */
    public List<String> experienciaTopSeller() {
        List<Experiencia> todasExperiencias = experienciaRepository.getExperienciaArray();
        List<Ratings> todosRatings = ratingsRepository.getRatingsArray();

        List<String> resultados = new ArrayList<>();
        int maiorContagem = 0;

        // Percorre cada experiência para contar quantos ratings ela teve
        for (Experiencia experienciaAtual : todasExperiencias) {
            String idExp = experienciaAtual.getIdExperiencia();
            int contador = 0;

            // Conta quantas vezes a experiência aparece nos ratings
            for (Ratings ratingAtual : todosRatings) {
                if (ratingAtual.getIdExperiencia().equals(idExp)) {
                    contador++;
                }
            }

            // Se encontrou um novo maior, limpa a lista e adiciona só ele
            if (contador > maiorContagem) {
                maiorContagem = contador;
                resultados.clear();
                resultados.add("Experiência: " + experienciaAtual.getNome()
                        + " | ID: " + experienciaAtual.getIdExperiencia()
                        + " | Bilhetes vendidos: " + contador);
            }
            // Se empatou com o maior atual, adiciona também
            else if (contador == maiorContagem && contador > 0) {
                resultados.add("Experiência: " + experienciaAtual.getNome()
                        + " | ID: " + experienciaAtual.getIdExperiencia()
                        + " | Bilhetes vendidos: " + contador);
            }
        }

        return resultados;
    }

    /**
     * Permite ao cliente avaliar uma experiência.
     * Pergunta o rating da experiência e o rating do guia.
     *
     * @return true se a avaliação foi realizada com sucesso, false caso contrário
     */
    public boolean avaliarExperiencia() {
        // TODO: Implementar lógica para avaliar uma experiência
        System.out.println("\nMÉTODO A SER IMPLEMENTADO");
        return false;
    }
}
