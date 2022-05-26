package code.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import code.model.Paziente;
import code.model.Scheda;

public class DataBaseMock {

    public void addPaziente(Paziente p){
        // to do
        return;
    }
    public void removePaziente(int pazienteId){
        // to do
        return;
    }
    public boolean modificaPaziente(Paziente p){
        // to do
        return true;
    }
    public Paziente getPaziente(int pazienteId){
        return new Paziente();
    }
    
    public Paziente getPaziente(String nome, String cognome, LocalDate dataNascita){
        return new Paziente();
    }

    public List<Paziente> getPazienti(String nome){
        return new ArrayList<Paziente>();
    }

    public void addScheda(int pazienteId, Scheda scheda){
        // to do
        return;
    }
    public void removeScheda(int pazienteId, int schedaId){
        // to do
        return;
    }
    public boolean modificaScheda(int pazienteId, Scheda scheda){
        // to do
        return true;
    }
    public Scheda getScheda(int pazienteId, int schedaId){
        return new Scheda();
    }

    public Scheda getSchedaCorrente(int pazienteId){
        return new Scheda();
    }

    public List<Scheda> getSchede(int pazienteId){
        return new ArrayList<Scheda>();
    }
}
