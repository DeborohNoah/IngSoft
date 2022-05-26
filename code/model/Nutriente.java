package code.model;

public class Nutriente {
    private String nome;
    private TipoNutriente tipo;

    public Nutriente() {
    }

    public Nutriente(String nome, TipoNutriente tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoNutriente getTipo() {
        return this.tipo;
    }

    public void setTipo(TipoNutriente tipo) {
        this.tipo = tipo;
    }

    public Nutriente nome(String nome) {
        setNome(nome);
        return this;
    }

    public Nutriente tipo(TipoNutriente tipo) {
        setTipo(tipo);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", tipo='" + getTipo() + "'" +
            "}";
    }

}
