package code.model;

import java.time.DayOfWeek;
import java.util.HashMap;
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
    public Pasto(String nome, DayOfWeek giorno) {
        this.nome = nome;
        this.giorno = giorno;
        this.alimenti = new HashMap<>();
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

    public void aggiungiAlimento(Alimento a, int quantita){
        this.alimenti.put(a, quantita);
    }



    public void modificaAlimento(Alimento a, int quantita){
        this.alimenti.remove(a);
        this.alimenti.put(a, quantita);
    }

    public void rimuoviAlimento(Alimento a){
        this.alimenti.remove(a);
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
