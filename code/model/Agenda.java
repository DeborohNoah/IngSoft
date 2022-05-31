package code.model;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    
    
   
    private List<Appuntamento> agenda;


    public Agenda() {
        this.agenda=new ArrayList<>();
    }

    public Agenda(List<Appuntamento> agenda) {
        this.agenda = agenda;
    }

    public List<Appuntamento> getAgenda() {
        return this.agenda;
    }

    public void setAgenda(List<Appuntamento> agenda) {
        this.agenda = agenda;
    }


    public void aggiungiAppuntamento(Appuntamento e){
        this.agenda.add(e);
    }


    public void modificaAppuntamento(Appuntamento e){
        Appuntamento old=this.getAppuntamentoByDataPaziente(e);
        this.agenda.remove(old);
        this.agenda.add(e);
    }

    public void eliminaAppuntamento(Appuntamento e){
        this.agenda.remove(e);
    }
    @Override
    public String toString() {
        return "{" +
            " agenda='" + getAgenda() + "'" +
            "}";
    }

    private Appuntamento getAppuntamentoByDataPaziente(Appuntamento ap){
        for(Appuntamento a : this.agenda){
            if(a.getData().isEqual(ap.getData()) && a.getPaziente().equals(ap.getPaziente())){
                return a;
            }
        }
        return null;
    }


}
