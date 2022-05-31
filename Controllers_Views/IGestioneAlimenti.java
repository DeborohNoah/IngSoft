package Controllers_Views;

import java.util.List;
import java.util.Map;

import code.model.Alimento;

public interface IGestioneAlimenti {
    public List<Alimento>  listAlimenti(); 
    public List<Alimento> searchAlimenti(String ricercaAlimento); 
public Alimento getAlimento( String nomeAlimento); 
public boolean addAlimento( String nomeAlimento,
Map<String, Float> macronutrienti,
Map<String, Float> micronutrienti ); 
public boolean updateAlimento( String nomeAlimento,
Map<String, Float> macronutrienti,
Map<String, Float> micronutrienti ); 
public  boolean deleteAlimento( String nomeAlimento); 


}
