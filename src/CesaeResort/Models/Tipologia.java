package CesaeResort.Models;

public class Tipologia {
    private String id;
    private String descricao;
    private float preco_por_semana;

    public Tipologia(String id, String descricao, float preco_por_semana) {
        this.id = id;
        this.descricao = descricao;
        this.preco_por_semana = preco_por_semana;
    }

    public String getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public float getPreco_por_semana() {
        return preco_por_semana;
    }

    @Override
    public String toString() {
        return "descricao=" + descricao +
                "| preco_por_semana=" + preco_por_semana +
                '\n';
    }
}
