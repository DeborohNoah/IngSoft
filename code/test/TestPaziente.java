package code.test;
import code.model.Paziente;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.*;

public class TestPaziente{
    
    Paziente paziente;

        @Before
        private void inizializza(){

            String nome= "Gaelia";
            String cognome= "Mauro";
            LocalDate dataNascita=LocalDate.of(2001, 9, 11);
            String telefono="333 33 33 333";
            String mail= "gaelia.mauro@google.com";
            paziente=new Paziente(nome, cognome, dataNascita, telefono, mail);

        }

        @Test
        private void testGetters(){
            assertEquals(paziente.getNome(), "Gaelia");
            assertEquals(paziente.getCognome(), "Mauro");
            assertEquals(paziente.getDataNascita(), LocalDate.of(2001, 9, 11));
            assertEquals(paziente.getTelefono(), "333 33 33 333");
            assertEquals(paziente.getMail(), "gaelia.mauro@google.com");

        }


    
}