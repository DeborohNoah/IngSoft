package code.model;

import java.time.DayOfWeek;
import java.util.Map;

public class Pasto {
    private String nome;
    private DayOfWeek giorno;
    private Map<Alimento, Integer> alimenti;

    public Pasto() {
    }

    public Pasto(String nome, DayOfWeek giorno, Map<Alimento, Integer> alimenti) {
        this.nome = nome;
        this.giorno = giorno;
        this.alimenti = alimenti;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public DayOfWeek getGiorno() {
        return this.giorno;
    }

    public void setGiorno(DayOfWeek giorno) {
        this.giorno = giorno;
    }

    public Map<Alimento, Integer> getAlimenti() {
        return this.alimenti;
    }

    public void setAlimenti(Map<Alimento, Integer> alimenti) {
        this.alimenti = alimenti;
    }

    public Pasto nome(String nome) {
        setNome(nome);
        return this;
    }

    public Pasto giorno(DayOfWeek giorno) {
        setGiorno(giorno);
        return this;
    }

    public Pasto alimenti(Map<Alimento, Integer> alimenti) {
        setAlimenti(alimenti);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
                " nome='" + getNome() + "'" +
                ", giorno='" + getGiorno() + "'" +
                ", alimenti='" + getAlimenti() + "'" +
                "}";
    }

}
