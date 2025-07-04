package CesaeResort.Models;

public class User {
    private String username;
    private String password;
    private String tipo_acesso;

    public User(String username, String password, String tipo_acesso) {
        this.username = username;
        this.password = password;
        this.tipo_acesso = tipo_acesso;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getTipo_acesso() {
        return tipo_acesso;
    }
}
