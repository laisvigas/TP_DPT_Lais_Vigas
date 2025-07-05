package CesaeResort.Views;
import CesaeResort.Controllers.LoginController;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class LoginView {

    private LoginController loginController;

    public LoginView() throws FileNotFoundException {
        this.loginController = new LoginController();
    }

    public void mainMenu() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        int opcaoLogin;

        do {
            System.out.println("\n\n********** Boas-Vindas ao CESAE Resort – Hotel Temático da Programação **********\n");
            System.out.println("1. Cliente");
            System.out.println("2. Rececionista");
            System.out.println("3. Guia de Experiência");
            System.out.println("4. Administrador");
            System.out.println("\n0. Terminar Programa");

            System.out.print("\nOpção: ");
            opcaoLogin = input.nextInt();

            switch (opcaoLogin) {
                case 1:
                    // CLIENTE
                    ClientView cv = new ClientView();
                    cv.clientMenu();
                    break;

                case 2:
                    // RECECIONISTA
                    this.loginMenu();
                    break;

                case 3:
                    // GUIA DE EXPERIÊNCIA
                    this.loginMenu();
                    break;

                case 4:
                    // ADMINISTRADOR
                    this.loginMenu();
                    break;

                case 0:
                    System.out.println("\nObrigado por utilizar o nosso programa... Até à próxima!");
                    break;

                default:
                    System.out.println("\nOpção Inválida");
            }
        } while (opcaoLogin != 0);
    }


    public void loginMenu() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        System.out.print("\nUsername: ");
        String usernameInput = input.next();

        System.out.print("Password: ");
        String passwordInput = input.next();

        String accessType = this.loginController.validateLogin(usernameInput, passwordInput);

        switch (accessType){
            case "ADMIN":
                break;

            case "GESTAO":
                RececionistaView rv = new RececionistaView();
                rv.rececionistaMenu();
                break;

            case "GUIA":
                System.out.println("Acessos inválidos");
                break;
        }

    }
}
