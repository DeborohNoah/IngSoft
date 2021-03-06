package code.test;
import code.model.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
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
            float plicaQuadricipitale=8;

            scheda=new Scheda(0, peso, circonferenzaVita, circonferenzaFianchi, plicaTricipitale,
                                        plicaSottoscapolare, plicaSovrailliaca, plicaAddominale, plicaBicipitale,
                                         plicaQuadricipitale, new HashMap<String, Path>(), new Dieta());
          
            storico.add(scheda);
            paziente=new Paziente(0, nome, cognome, dataNascita, telefono, mail, storico);


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
            assertEquals(scheda.getPlicaQuadricipitale(), 8);   
            
            
            float peso=100; 
            float circonferenzaVita=150;
            float circonferenzaFianchi=180;
            float plicaTricipitale=10;
            float plicaSottoscapolare=7;
            float plicaSovrailliaca=9;
            float plicaAddominale=2;
            float plicaBicipitale=1;
            float plicaQuadricipitale=20;

            scheda.setPeso(peso);
            scheda.setCirconferenzaFianchi(circonferenzaFianchi);
            scheda.setCirconferenzaVita(circonferenzaVita);
            scheda.setPlicaTricipitale(plicaTricipitale);
            scheda.setPlicaSottoscapolare(plicaSottoscapolare);
            scheda.setPlicaSovrailliaca(plicaSovrailliaca);
            scheda.setPlicaBicipitale(plicaBicipitale);
            scheda.setPlicaAddominale(plicaAddominale);
            scheda.setPlicaQuadricipitale(plicaQuadricipitale);

            
            assertEquals(scheda.getPeso(), 100);
            assertEquals(scheda.getCirconferenzaVita(), 150);
            assertEquals(scheda.getCirconferenzaFianchi(), 180);
            assertEquals(scheda.getPlicaTricipitale(), 10);
            assertEquals(scheda.getPlicaSottoscapolare(), 7);
            assertEquals(scheda.getPlicaSovrailliaca(), 9);      
            assertEquals(scheda.getPlicaAddominale(), 2);
            assertEquals(scheda.getPlicaBicipitale(), 1);
            assertEquals(scheda.getPlicaQuadricipitale(), 20); 

            peso=70; 
            circonferenzaVita=102;
            circonferenzaFianchi=105;
            plicaTricipitale=4;
            plicaSottoscapolare=6;
            plicaSovrailliaca=5;
            plicaAddominale=9;
            plicaBicipitale=7;
            plicaQuadricipitale=8;
            Scheda secondaScheda = new Scheda(1, peso, circonferenzaVita, circonferenzaFianchi, plicaTricipitale, 
                                                plicaSottoscapolare, plicaSovrailliaca, plicaAddominale, plicaBicipitale, 
                                                plicaQuadricipitale, new HashMap<String, Path>(), new Dieta());
            
            paziente.getStorico().aggiungiScheda(secondaScheda);
            Scheda scheda2 = paziente.getStorico().getScheda(1);

            
            assertEquals(scheda2.getPeso(), 70);
            assertEquals(scheda2.getCirconferenzaVita(), 102);
            assertEquals(scheda2.getCirconferenzaFianchi(), 105);
            assertEquals(scheda2.getPlicaTricipitale(), 4);
            assertEquals(scheda2.getPlicaSottoscapolare(), 6);
            assertEquals(scheda2.getPlicaSovrailliaca(), 5);      
            assertEquals(scheda2.getPlicaAddominale(), 9);
            assertEquals(scheda2.getPlicaBicipitale(), 7);
            assertEquals(scheda2.getPlicaQuadricipitale(), 8);  
        }
    
}