package CesaeResort.Views;
import CesaeResort.Controllers.RececionistaController;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RececionistaView {
    private RececionistaController rececionistaController;

    public RececionistaView() throws FileNotFoundException {
        this.rececionistaController = new RececionistaController();
    }

    public void rececionistaMenu(){
        Scanner input = new Scanner(System.in);
        int opcaoRececionista;

        do {
            System.out.println("\n\n********** MENU RECECIONISTA **********");
            System.out.println("1. Consultar Quartos Disponíveis");
            System.out.println("2. Consultar Quartos Reservados");
            System.out.println("3. Consultar Reservas Atuais");
            System.out.println("4. Efetuar uma Reserva");
            System.out.println("5. Reservar uma Experiência");
            System.out.println("0. Voltar");

            System.out.print("\nOpção: ");
            opcaoRececionista = input.nextInt();

            switch (opcaoRececionista){
                case 1:
                    System.out.println("\n***** Consultar Quartos Disponíveis *****");
                    System.out.println(this.rececionistaController.consultarQuartosDisponiveis());
                    break;
                case 2:
                    System.out.println("\n***** Consultar Quartos Reservados *****");
                    System.out.println(this.rececionistaController.consultarQuartosReservados());
                    break;
                case 3:
                    System.out.println("\n***** Consultar Reservas Atuais *****");
                    System.out.println(this.rececionistaController.consultarReservasAtuais());
                    break;
                case 4:
                    System.out.println("\n***** Efetuar uma Reserva *****\n");
                    System.out.print("ID do cliente: ");
                    String idCliente = input.next();
                    System.out.print("Número do quarto: ");
                    int numQuarto = input.nextInt();
                    System.out.print("Ano: ");
                    int ano = input.nextInt();
                    System.out.print("Mês: ");
                    int mes = input.nextInt();
                    System.out.print("Semana: ");
                    int semana = input.nextInt();

                    System.out.println(this.rececionistaController.efetuarReserva(idCliente, numQuarto, ano, mes, semana));
                    break;
                case 5:
                    System.out.println("\n*****  Reservar uma Experiência *****");
                    //String idCliente, String idReserva, int numAdultos, int numCriancas
                    System.out.print("ID do cliente: ");
                    String idCliente2 = input.next();
                    System.out.print("ID da reserva: ");
                    String idReserva = input.next();
                    System.out.print("Número de adultos: ");
                    int numAdultos = input.nextInt();
                    System.out.print("Número de crianças: ");
                    int numCriancas = input.nextInt();
                    System.out.println(this.rececionistaController.reservarExperiencia(idCliente2, idReserva, numAdultos, numCriancas));
                    break;
                case 0:
                    break;
                default:
                    System.out.println("\nOpção Inválida!");
            }

        } while (opcaoRececionista != 0);
    }
}
