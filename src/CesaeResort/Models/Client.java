package CesaeResort.Models;

public class Client {
    private String id_client;
    private String nome;
    private String nacionalidade;
    private String email;
    private int telemovel;
    private String data_nascimento;
    private boolean consentimento_marketing;

    public Client(String id_client, String nome, String nacionalidade, String email,
                  int telemovel, String data_nascimento, boolean consentimento_marketing) {
        this.id_client = id_client;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.email = email;
        this.telemovel = telemovel;
        this.data_nascimento = data_nascimento;
        this.consentimento_marketing = consentimento_marketing;
    }

    public String getId_client() {
        return id_client;
    }

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public String getEmail() {
        return email;
    }

    public int getTelemovel() {
        return telemovel;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public boolean isConsentimento_marketing() {
        return consentimento_marketing;
    }
}
