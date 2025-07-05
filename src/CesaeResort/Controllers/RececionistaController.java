package CesaeResort.Controllers;
import CesaeResort.Models.*;
import CesaeResort.Repositories.*;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

// Método implementado: consultarQuartosReservados()

public class RececionistaController {
    private QuartosRepository quartosRepository;
    private ReservasRepository reservasRepository;
    private TipologiaRepository tipologiaRepository;
    private ClienteRepository clienteRepository;

    public RececionistaController() throws FileNotFoundException {
        this.quartosRepository = new QuartosRepository();
        this.reservasRepository = new ReservasRepository();
        this.tipologiaRepository = new TipologiaRepository();
        this.clienteRepository = new ClienteRepository();
    }

    /**
     * Consulta e retorna a lista de quartos disponíveis.
     * Cada quarto contém: número do quarto, tipologia, preço por semana
     *
     * @return Lista de strings formatadas com os dados dos quartos
     */
    public List<String> consultarQuartosDisponiveis(){
        // TODO: Implementar lógica para consultar quartos
        System.out.println("\nMÉTODO A SER IMPLEMENTADO");
        return new ArrayList<>();
    }

    /**
     * Consulta e retorna a lista de quartos reservados.
     * Cada quarto reservado contém: número do quarto, tipologia, dados do cliente e data da reserva.
     *
     * @return Lista de strings formatadas com os dados dos quartos reservados
     */
    public List<String> consultarQuartosReservados() {
        List<String> dados = new ArrayList<>();

        for (Reservas reserva : reservasRepository.getReservasArray()) {
            int numQuarto = reserva.getNumQuarto();
            String idCliente = reserva.getIdCliente();
            int ano = reserva.getAno();
            int mes = reserva.getMes();
            int semana = reserva.getSemana();

            // Buscar cliente pelo ID
            Client clienteEncontrado = null;
            for (Client clienteAtual : clienteRepository.getClientesArray()) {
                if (clienteAtual.getId_client().equals(idCliente)) {
                    clienteEncontrado = clienteAtual;
                    break;
                }
            }

            // Buscar tipologia pelo número do quarto → quarto → idTipologia
            int idTipologia = -1;
            for (Quarto quartoAtual : quartosRepository.getQuartosArray()) {
                if (quartoAtual.getNum_quarto() == numQuarto) {
                    idTipologia = quartoAtual.getId_tipologia();
                    break;
                }
            }

            String descricaoTipologia = "Desconhecida";
            for (Tipologia tipoAtual : tipologiaRepository.getTipologiaArray()) {
                if (Integer.parseInt(tipoAtual.getId()) == idTipologia) {
                    descricaoTipologia = tipoAtual.getDescricao();
                    break;
                }
            }

            if (clienteEncontrado != null) {
                dados.add("Quarto: " + numQuarto +
                        " | Tipologia: " + descricaoTipologia +
                        " | ID Cliente: " + clienteEncontrado.getId_client() +
                        " | Nome: " + clienteEncontrado.getNome() +
                        " | Email: " + clienteEncontrado.getEmail() +
                        " | Nacionalidade: " + clienteEncontrado.getNacionalidade() +
                        " | Ano: " + ano +
                        " | Mês: " + mes +
                        " | Semana: " + semana +
                        "\n");
            }
        }

        return dados;
    }

    /**
     * Consulta e retorna a lista de reservas da semana atual.
     * Cada reserva contém: número do quarto, tipologia, ID do cliente, nome,
     * email e nacionalidade.
     *
     * @return Lista de strings formatadas com os dados das reservas da semana atual
     */
    public List<String> consultarReservasAtuais() {
        // TODO: Implementar lógica para filtrar as reservas da semana atual
        System.out.println("\nMÉTODO A SER IMPLEMENTADO");
        return new ArrayList<>();
    }

    /**
     * Tenta efetuar uma reserva para o cliente em um quarto específico para uma determinada semana.
     *
     * @param idCliente Identificador único do cliente
     * @param numQuarto Número do quarto desejado
     * @param ano Ano da reserva
     * @param mes Mês da reserva
     * @param semana Semana do ano da reserva
     * @return true se a reserva foi efetuada com sucesso; false se o quarto não está disponível
     */
    public boolean efetuarReserva(String idCliente, int numQuarto, int ano, int mes, int semana){
        System.out.println("\nMÉTODO A SER IMPLEMENTADO");
        return false;
    }

    /**
     * Efetua a reserva de uma experiência com base nas informações fornecidas.
     *
     * @param idCliente   ID do cliente que está a efetuar a reserva.
     * @param idReserva   ID da reserva associada ao quarto (já existente).
     * @param numAdultos  Número de adultos que participarão da experiência.
     * @param numCriancas Número de crianças que participarão da experiência.
     * @return true se a reserva da experiência for efetuada com sucesso, false caso contrário.
     */
    public boolean reservarExperiencia(String idCliente, String idReserva, int numAdultos, int numCriancas) {
        // TODO: Implementar lógica para reservar uma experiência
        System.out.println("\nMÉTODO A SER IMPLEMENTADO");
        return false;
    }
}
