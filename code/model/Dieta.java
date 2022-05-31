package code.model;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Dieta {
    
    private int dietaId;
    private String descrizione;
    private List<Pasto> pasti;
    private List<Soglia> soglie;
    
    public Dieta(){

    }

    public Dieta(int dietaId, String descrizione, List<Pasto> pasti) {
        this.dietaId = dietaId;
        this.descrizione = descrizione;
        this.pasti = pasti;
        this.soglie=new ArrayList<>();
    }

    public Dieta(int dietaId, String descrizione) {
        this.dietaId = dietaId;
        this.descrizione = descrizione;
        this.pasti =new ArrayList<>();
        this.soglie=new ArrayList<>();
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

    public void aggiungiPasto(String nome, DayOfWeek giorno){
        this.pasti.add(new Pasto(nome, giorno));
    }

    public void aggiungiSoglia(Soglia s){
        this.soglie.add(s);
    }

    public Map<Nutriente, Float> calcolaValoriNutrizionali(){
        Map<Nutriente, Float> res=new HashMap<>();
        for(Pasto p: this.pasti){
            for(Entry<Alimento, Integer> a: p.getAlimenti().entrySet()){
                for(Entry<Nutriente, Float> n: a.getKey().getValoriNutrizionali().entrySet()){          
                if(!res.containsKey(n.getKey())){
                    res.put(n.getKey(), (n.getValue()*a.getValue())/100);
                }
                else {
                    res.replace(n.getKey(), res.get(n.getKey())+(n.getValue()*a.getValue())/100);
                }
                }
            }
        }
        return res;
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
