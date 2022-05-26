package code.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import code.model.*;

public class AlimentiController {
    public List<Alimento> getAlimenti(){
        return new ArrayList<Alimento>();
    }
    public List<Alimento> searchAlimenti(String ricercaAlimento){
        return new ArrayList<Alimento>();
    }
    public Alimento getAlimento(String nomeAlimento){
        return new Alimento();
    }
    public boolean addAlimento(String nomeAlimento, Map<String, Float> macronutrienti, Map<String, Float>  micronutrienti){
        return true;
    }
    public boolean updateAlimento(String nomeAlimento, int quantità, Map<String, Float> macronutrienti, Map<String, Float> micronutrienti){
        return true;
    }
    public boolean deleteAlimento(String nomeAlimento){
        return true;
    }
}
