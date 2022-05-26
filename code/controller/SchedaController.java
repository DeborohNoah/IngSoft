package code.controller;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import code.model.Scheda;

public class SchedaController {
    public Scheda getSchedaCorrente(int pazienteId){
        return new Scheda();
    }
    public Scheda getScheda(int pazienteId, int schedaId){
        return new Scheda();
    }
    public List<Scheda> getSchede(int pazienteId){
        return new ArrayList<Scheda>();
    }
    public boolean addScheda(int pazienteId, Map<String,Float> mapmisure, Map<String, Path> datiClinici, Dieta dieta){
        return true;
    }
    public boolean updateScheda(int schedaId, int pazienteId, Map<String,Float> misure, Map<File, String> datiClinici){
        return true;
    }
    public boolean deleteScheda(int schedaId){
        return true;
    }
}
