package code.model;

import java.util.Map;

public class Alimento {
    private String nome;
    private Map<Nutriente, Float> valoriNutrizionali;

    public Alimento() {
    }

    public Alimento(String nome, Map<Nutriente,Float> valoriNutrizionali) {
        this.nome = nome;
        this.valoriNutrizionali = valoriNutrizionali;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Map<Nutriente,Float> getValoriNutrizionali() {
        return this.valoriNutrizionali;
    }

    public void setValoriNutrizionali(Map<Nutriente,Float> valoriNutrizionali) {
        this.valoriNutrizionali = valoriNutrizionali;
    }

    public Alimento nome(String nome) {
        setNome(nome);
        return this;
    }

    public Alimento valoriNutrizionali(Map<Nutriente,Float> valoriNutrizionali) {
        setValoriNutrizionali(valoriNutrizionali);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", valoriNutrizionali='" + getValoriNutrizionali() + "'" +
            "}";
    }
    
    public Map<Nutriente,Float> calcolaValoriNutrizionali(Map<Nutriente, Float> grammi) {
        return this.valoriNutrizionali;
    }

}
