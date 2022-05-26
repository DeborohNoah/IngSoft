package code.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import code.model.Paziente;
import code.model.Scheda;

public class PazientiController {
    
    public Paziente getPaziente(String nome, String cognome, LocalDate dataNascita){
        return new Paziente();
    }

    public Paziente getPaziente(int pazienteId){
        return new Paziente();
    }

    public List<Paziente> searchPazienti(String nome){
        return new ArrayList<>();
    }

    public List<Paziente> getPazienti(){
        return new ArrayList<>();
    }


    public void addPaziente(int pazienteId, String nome, String cognome, LocalDate dataNascita,
     String telefono, String mail, List<Scheda> storico){
        // to do
        return;
    }

    public void removePaziente(int pazienteId){
        // to do
        return;
    }

    public boolean updatePaziente(int pazienteId, String nome, String cognome, LocalDate dataNascita,
                                    String telefono, String mail, List<Scheda> storico){
        // to do
        return true;
    }

    
}
