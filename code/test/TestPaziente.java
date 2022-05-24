package code.test;
import code.model.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class TestPaziente{
    
    Paziente paziente;
    Scheda scheda;

        @Before
        private void inizializza(){

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
            scheda=new Scheda(0, peso, circonferenzaVita, circonferenzaFianchi, plicaTricipitale, plicaSottoscapolare, 
                                plicaSovrailliaca, plicaAddominale, plicaBicipitale, plicaQuadricipiatale);
          
            storico.add(scheda);
            paziente=new Paziente(nome, cognome, dataNascita, telefono, mail, storico);


        }

        @Test
        private void testGettersPaziente(){
            assertEquals(paziente.getNome(), "Luigi");
            assertEquals(paziente.getCognome(), "Mario");
            assertEquals(paziente.getDataNascita(), LocalDate.of(2001, 9, 11));
            assertEquals(paziente.getTelefono(), "333 33 33 333");
            assertEquals(paziente.getMail(), "mario.mario@gmail.com");
        }

        @Test
        private void testSettersPaziente(){
            paziente.setNome("Mario");
            paziente.setCognome("Luigi");
            paziente.setMail("luigi.mario@gmail.com");
            paziente.setTelefono("4206942069");
            paziente.setDataNascita(LocalDate.now());
            assertEquals(paziente.getCognome(), "Luigi");
            assertEquals(paziente.getNome(), "Mario");
            assertEquals(paziente.getMail(), "luigi.mario@gmail.com");
            assertEquals(paziente.getTelefono(), "4206942069");
            assertEquals(paziente.getDataNascita(), LocalDate.now());

        }

        @Test
        private void testGettersSettersScheda(){
            Scheda scheda = paziente.getStorico().getScheda(0);
            
            assertEquals(scheda.getPeso(), 70);
            assertEquals(scheda.getCirconferenzaVita(), 102);
            assertEquals(scheda.getCirconferenzaFianchi(), 105);
            assertEquals(scheda.getPlicaTricipitale(), 4);
            assertEquals(scheda.getPlicaSottoscapolare(), 6);
            assertEquals(scheda.getPlicaSovrailliaca(), 5);      
            assertEquals(scheda.getPlicaAddominale(), 9);
            assertEquals(scheda.getPlicaBicipitale(), 7);
            assertEquals(scheda.getPlicaQuadricipiatale(), 8);       
            float peso=100; 
            float circonferenzaVita=150;
            float circonferenzaFianchi=180;
            float plicaTricipitale=10;
            float plicaSottoscapolare=7;
            float plicaSovrailliaca=9;
            float plicaAddominale=2;
            float plicaBicipitale=1;
            float plicaQuadricipiatale=20;

            Scheda secondaScheda = new Scheda(1, peso, circonferenzaVita, circonferenzaFianchi, plicaTricipitale, 
                                                plicaSottoscapolare, plicaSovrailliaca, plicaAddominale, plicaBicipitale, plicaQuadricipiatale);
            
            paziente.getStorico().aggiungiScheda(secondaScheda);
            Scheda scheda2 = paziente.getStorico().getScheda(1);

            assertEquals(scheda2.getPeso(), 100);
            assertEquals(scheda2.getCirconferenzaVita(), 150);
            assertEquals(scheda2.getCirconferenzaFianchi(), 180);
            assertEquals(scheda2.getPlicaTricipitale(), 10);
            assertEquals(scheda2.getPlicaSottoscapolare(), 7);
            assertEquals(scheda2.getPlicaSovrailliaca(), 9);      
            assertEquals(scheda2.getPlicaAddominale(), 2);
            assertEquals(scheda2.getPlicaBicipitale(), 1);
            assertEquals(scheda2.getPlicaQuadricipiatale(), 20); 
        }
    
}