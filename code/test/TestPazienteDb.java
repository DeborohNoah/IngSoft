package code.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import code.controller.PazientiController;
import code.model.Dieta;
import code.model.Paziente;
import code.model.Scheda;

public class TestPazienteDb {
    
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
        Scheda scheda=new Scheda(0, peso, circonferenzaVita, circonferenzaFianchi, plicaTricipitale, plicaSottoscapolare, 
                            plicaSovrailliaca, plicaAddominale, plicaBicipitale,
                             plicaQuadricipiatale, new HashMap<String, Path>(), new Dieta());
      
        storico.add(scheda);
        Paziente paziente=new Paziente(pazienteId, nome, cognome, dataNascita, telefono, mail, storico);
        db.addPaziente(paziente);        
    }

    @Test
    public void testRicerca(){
        PazientiController controller= new PazientiController();
        String nome = "Mario";
        List<Paziente> pazientiDb = db.getPazienti(nome);
        List<Paziente> pazienti=controller.searchPazienti(nome);
        Paziente pDb = pazientiDb.get(0);
        Paziente p=controller.getPaziente(pazienti.get(0).getPazienteId());
        assertEquals(p.getNome(), pDb.getNome());
    }

    @Test
    public void testAggiunta(){
        int pazienteId = 2;
        String nome = "Giulio";
        String cognome = "Giuliani";
        LocalDate dataNascita=LocalDate.of(1969, 4, 20);
        String telefono = "222 22 22 222";
        String mail = "giulio.giuliani@yahoo.com";
        List<Scheda> storico = new ArrayList<Scheda>();
        Paziente giulio = new Paziente(pazienteId, nome, cognome, dataNascita, telefono, mail, storico);
        PazientiController controller= new PazientiController();
        controller.addPaziente(pazienteId, nome, cognome, dataNascita, telefono, mail, storico);
        List<Paziente> pazienti=controller.searchPazienti(nome);

        boolean found = false;
        for(Paziente paz : pazienti){
            if(paz.equals(giulio)){
                found = true;
            }
        }
        assertEquals(found, true);
    }
    
    @Test
    public void testModifica(){
        PazientiController controller= new PazientiController();
        String nome = "Giulio";
        String cognome = "Giuliano";
        LocalDate dataNascita=LocalDate.of(1969, 4, 20);
        String telefono = "222 22 22 456";
        String mail = "giulio.giuliano@yahoo.com";
        List<Scheda> storico = new ArrayList<Scheda>();
        int giulioId = controller.getPaziente(nome, cognome, dataNascita).getPazienteId();
        Paziente newGiulio = new Paziente(giulioId, nome, cognome, dataNascita, telefono, mail, storico);
        controller.updatePaziente(giulioId, nome, cognome, dataNascita, telefono, mail, storico);
        List<Paziente> pazienti=controller.searchPazienti(nome);

        boolean found = false;
        for(Paziente paz : pazienti){
            if(paz.equals(newGiulio)){
                found = true;
            }
        }
        assertEquals(found, true);
    }

    @Test
    public void testRimuovi(){
        PazientiController controller= new PazientiController();
        String nome = "Giulio";
        String cognome = "Giuliano";
        LocalDate dataNascita=LocalDate.of(1969, 4, 20);
        Paziente giulio = controller.getPaziente(nome, cognome, dataNascita);
        controller.removePaziente(giulio.getPazienteId());
        boolean found = false;
        for(Paziente paz : controller.getPazienti()){
            if(paz.equals(giulio)){
                found = true;
            }
        }
        assertEquals(found, false);
    }
}
