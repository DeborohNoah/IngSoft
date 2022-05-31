package Controllers_Views;

import java.util.List;
import java.util.Map;

import code.model.Soglia;

public interface IGestioneSoglie {
    

    public  Map<String,Boolean> checkSoglie(int dietaId);
    public boolean addSoglia(int dietaId ,String sogliaTipo,float min, float max); 
    public boolean removeSoglia(int dietaId, String sogliaTipo); 
    public boolean updateSoglia(int dietaId,String sogliaTipo, float newMin, float newMax);
    public List<Soglia> getSoglie(int dietaId);

}
