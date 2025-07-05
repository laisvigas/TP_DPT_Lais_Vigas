package CesaeResort.Models;

// experiencias: id,nome,id_guia_experiencia,preco_adulto,preco_crianca
public class Experiencia {
    private String idExperiencia;
    private String nome;
    private String id_guia_experiencia;
    private float preco_adulto;
    private float preco_crianca;

    public Experiencia(String idExperiencia, String nome, String id_guia_experiencia, float preco_adulto, float preco_crianca) {
        this.idExperiencia = idExperiencia;
        this.nome = nome;
        this.id_guia_experiencia = id_guia_experiencia;
        this.preco_adulto = preco_adulto;
        this.preco_crianca = preco_crianca;
    }


    public String getIdExperiencia() {
        return idExperiencia;
    }

    public String getNome() {
        return nome;
    }

    public String getId_guia_experiencia() {
        return id_guia_experiencia;
    }

    public float getPreco_adulto() {
        return preco_adulto;
    }

    public float getPreco_crianca() {
        return preco_crianca;
    }
}
