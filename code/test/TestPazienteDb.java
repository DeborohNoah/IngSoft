package code.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import code.controller.PazientiController;
import code.model.Paziente;
import code.model.Scheda;

public class TestPazienteDb {
    
    DataBaseMock db;

    @Before
    public void inizializza(){
        db=new DataBaseMock();

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
        Scheda scheda=new Scheda(0, peso, circonferenzaVita, circonferenzaFianchi, plicaTricipitale, plicaSottoscapolare, 
                            plicaSovrailliaca, plicaAddominale, plicaBicipitale, plicaQuadricipiatale);
      
        storico.add(scheda);
        Paziente paziente=new Paziente(nome, cognome, dataNascita, telefono, mail, storico);
        db.addPaziente(paziente);        
    }


    @Test
    public void testRicerca(){
        PazientiController controller= new PazientiController();
        String nome="Mario";
        List<Paziente> pazienti=controller.getPazienti(nome);
    }
}
