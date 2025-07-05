package CesaeResort.Views;
import CesaeResort.Controllers.ClientController;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ClientView {
    private ClientController clientController;

    public ClientView() throws FileNotFoundException {
        this.clientController = new ClientController();
    }

    public void clientMenu(){
        Scanner input = new Scanner(System.in);
        int opcaoClient;

        do {
            System.out.println("\n\n********** MENU CLIENT **********");
            System.out.println("1. Quartos Disponíveis");
            System.out.println("2. Experiências Disponíveis");
            System.out.println("3. Experiência(s) Favorita(s)");
            System.out.println("4. Esperiêcia(s) Top-Seller");
            System.out.println("5. Avaliar Experiência");
            System.out.println("0. Voltar");

            System.out.print("\nOpção: ");
            opcaoClient = input.nextInt();

            switch (opcaoClient){
                case 1:
                    System.out.println("\n***** Quartos Disponíveis *****");
                    System.out.println(this.clientController.consultarQuartos());
                    break;
                case 2:
                    System.out.println("\n***** Experiências Disponíveis *****");
                    System.out.println(this.clientController.consultarExperiencias());
                    break;
                case 3:
                    System.out.println("\n***** Experiência Favorita *****");
                    System.out.println(this.clientController.experienciaFavorita());
                    break;
                case 4:
                    System.out.println("\n***** Esperiêcias Top-Seller *****");
                    System.out.println(this.clientController.experienciaTopSeller());
                    break;
                case 5:
                    System.out.println("\n*****  Avaliar Experiência *****");
                    System.out.println(this.clientController.avaliarExperiencia());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("\nOpção Inválida!");
            }

        } while (opcaoClient != 0);
    }
}
