package code.test;

import static org.junit.Assert.assertEquals;

import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import code.controller.SchedaController;
import code.model.Dieta;
import code.model.Paziente;
import code.model.Scheda;

public class TestSchedaDb {
    
    DataBaseMock db;

    @Before
    public void inizializza(){
        db=new DataBaseMock();
        int pazienteId = 1;
        String nome= "Luigi";
        String cognome= "Mario";
        LocalDate dataNascita=LocalDate.of(2001, 9, 11);
        String telefono="333 33 33 333";
        String mail= "mario.mario@gmail.com";
        List<Scheda> storico = new ArrayList<Scheda>();

        float peso=70; 
        float circonferenzaVita=102;
        float circonferenzaFianchi=105;
        float plicaTricipitale=4;
        float plicaSottoscapolare=6;
        float plicaSovrailliaca=5;
        float plicaAddominale=9;
        float plicaBicipitale=7;
        float plicaQuadricipiatale=8;
        Scheda scheda1=new Scheda(0, peso, circonferenzaVita, circonferenzaFianchi, plicaTricipitale, plicaSottoscapolare, 
                            plicaSovrailliaca, plicaAddominale, plicaBicipitale, plicaQuadricipiatale, new HashMap<String, Path>());

        peso=65; 
        circonferenzaVita=98;
        circonferenzaFianchi=100;
        plicaTricipitale=3;
        plicaSottoscapolare=4;
        plicaSovrailliaca=6;
        plicaAddominale=6;
        plicaBicipitale=2;
        plicaQuadricipiatale=4;
        Scheda scheda2=new Scheda(1, peso, circonferenzaVita, circonferenzaFianchi, plicaTricipitale, plicaSottoscapolare, 
                            plicaSovrailliaca, plicaAddominale, plicaBicipitale, plicaQuadricipiatale, 
                            new HashMap<String, Path>(), new Dieta());
      
        storico.add(scheda1);
        storico.add(scheda2);
        Paziente paziente=new Paziente(pazienteId, nome, cognome, dataNascita, telefono, mail, storico);
        db.addPaziente(paziente);        
    }

    @Test
    public void testGetSchedaCorrente(){
        int pazienteId = 1;
        SchedaController controllerScheda = new SchedaController();
        Scheda scheda=controllerScheda.getSchedaCorrente(pazienteId);
        assertEquals(scheda.getSchedaId(), 1);
    }

    @Test
    public void testAggiunta(){
        int pazienteId = 1;
        float peso=70; 
        float circonferenzaVita=102;
        float circonferenzaFianchi=105;
        float plicaTricipitale=4;
        float plicaSottoscapolare=6;
        float plicaSovrailliaca=5;
        float plicaAddominale=9;
        float plicaBicipitale=7;
        float plicaQuadricipiatale=8;

        HashMap<String, Float> misure = new HashMap<String, Float>();
        misure.put("circonferenzaVita", circonferenzaVita);
        misure.put("circonferenzaFianchi", circonferenzaFianchi);
        misure.put("plicaTricipitale", plicaTricipitale);
        misure.put("peso", peso);
        misure.put("plicaSottoscapolare", plicaSottoscapolare);
        misure.put("plicaSovrailliaca", plicaSovrailliaca);
        misure.put("plicaAddominale", plicaAddominale);
        misure.put("plicaBicipitale", plicaBicipitale);
        misure.put("plicaQuadricipiatale", plicaQuadricipiatale);
        
        HashMap<String, Path> datiClinici = new HashMap<String, Path>();
        datiClinici.put("analisiDelSangue",Path.of("dummy.txt"));
        
        SchedaController controller= new SchedaController();
        controller.addScheda(pazienteId, misure, datiClinici, new Dieta());
        Scheda lastScheda=controller.getSchedaCorrente(pazienteId);
        
        assertEquals(found, true);
    }
    
    @Test
    public void testModifica(){
        SchedaController controller= new SchedaController();
        float peso=70; 
        float circonferenzaVita=102;
        float circonferenzaFianchi=105;
        float plicaTricipitale=4;
        float plicaSottoscapolare=6;
        float plicaSovrailliaca=5;
        float plicaAddominale=9;
        float plicaBicipitale=7;
        float plicaQuadricipiatale=8;
        HashMap<String, Float> misure = new HashMap<String, Float>();
        misure.put("circonferenzaVita", circonferenzaVita);
        misure.put("circonferenzaFianchi", circonferenzaFianchi);
        misure.put("plicaTricipitale", plicaTricipitale);
        misure.put("peso", peso);
        misure.put("plicaSottoscapolare", plicaSottoscapolare);
        misure.put("plicaSovrailliaca", plicaSovrailliaca);
        misure.put("plicaAddominale", plicaAddominale);
        misure.put("plicaBicipitale", plicaBicipitale);
        misure.put("plicaQuadricipiatale", plicaQuadricipiatale);

        HashMap<String, Path> datiClinici = new HashMap<String, Path>();
        datiClinici.put("analisi",Path.of("notdummy.txt"));

        Scheda scheda1=new Scheda(2, peso, circonferenzaVita, circonferenzaFianchi, plicaTricipitale, plicaSottoscapolare, 
                            plicaSovrailliaca, plicaAddominale, plicaBicipitale, plicaQuadricipiatale, datiClinici, new Dieta());
        
        controller.addScheda(1, mapmisure, datiClinici)
        boolean found = false;
        for(Scheda paz : Schede){
            if(paz.equals(newGiulio)){
                found = true;
            }
        }
        assertEquals(found, true);
    }

    @Test
    public void testRimuovi(){
        SchedeController controller= new SchedeController();
        String nome = "Giulio";
        String cognome = "Giuliano";
        LocalDate dataNascita=LocalDate.of(1969, 4, 20);
        Scheda giulio = controller.getScheda(nome, cognome, dataNascita);
        controller.removeScheda(giulio.getSchedaId());
        boolean found = false;
        for(Scheda paz : controller.getSchede()){
            if(paz.equals(giulio)){
                found = true;
            }
        }
        assertEquals(found, false);
    }
}
