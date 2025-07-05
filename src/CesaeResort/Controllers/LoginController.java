package CesaeResort.Controllers;
import CesaeResort.Models.User;
import CesaeResort.Repositories.UserRepository;

import java.io.FileNotFoundException;

public class LoginController {
    private UserRepository usersRepository;

    public LoginController() throws FileNotFoundException {
        this.usersRepository = new UserRepository();
    }

    public String validateLogin(String usernameInput, String passwordInput){

        for(User userAtual : this.usersRepository.getUserArray()){
            if(userAtual.getUsername().equals(usernameInput) && userAtual.getPassword().equals(passwordInput)){
                return userAtual.getTipo_acesso();
            }
        }

        return "ERROR";
    }
}
