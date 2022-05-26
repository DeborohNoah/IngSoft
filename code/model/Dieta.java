package code.model;

import java.util.List;

public class Dieta {
    
    private int dietaId;
    private String descrizione;
    private List<Pasto> pasti;
    
    public Dieta(){

    }

    public Dieta(int dietaId, String descrizione, List<Pasto> pasti) {
        this.dietaId = dietaId;
        this.descrizione = descrizione;
        this.pasti = pasti;
    }

    public int getDietaId() {
        return this.dietaId;
    }

    public void setDietaId(int dietaId) {
        this.dietaId = dietaId;
    }

    public String getDescrizione() {
        return this.descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public List<Pasto> getPasti() {
        return this.pasti;
    }

    public void setPasti(List<Pasto> pasti) {
        this.pasti = pasti;
    }

    public Dieta dietaId(int dietaId) {
        setDietaId(dietaId);
        return this;
    }

    public Dieta descrizione(String descrizione) {
        setDescrizione(descrizione);
        return this;
    }

    public Dieta pasti(List<Pasto> pasti) {
        setPasti(pasti);
        return this;
    }


    @Override
    public String toString() {
        return "{" +
            " dietaId='" + getDietaId() + "'" +
            ", descrizione='" + getDescrizione() + "'" +
            ", pasti='" + getPasti() + "'" +
            "}";
    }


}
