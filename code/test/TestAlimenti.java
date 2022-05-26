package code.test;
import code.controller.AlimentiController;
import code.model.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;

import org.junit.*;

public class TestAlimenti{
    
    Paziente paziente;
    Scheda scheda;
    DataBaseMock db;
    @Before
    private void inizializza(){

        db = new DataBaseMock();
        Nutriente proteine = new Nutriente("Proteine", TipoNutriente.MACRONUTRIENTI);
        Nutriente lipidi = new Nutriente("lipidi", TipoNutriente.MACRONUTRIENTI);
        Nutriente glucidi = new Nutriente("glucidi", TipoNutriente.MACRONUTRIENTI);
        
        Nutriente vitaminaB1 = new Nutriente("vitaminaB1", TipoNutriente.MICRONUTRIENTI);
        Nutriente vitaminaC = new Nutriente("vitaminaC", TipoNutriente.MICRONUTRIENTI);
        Nutriente ferro = new Nutriente("ferro", TipoNutriente.MICRONUTRIENTI);
        Nutriente calcio = new Nutriente("calcio", TipoNutriente.MICRONUTRIENTI);
        Nutriente zinco = new Nutriente("zinco", TipoNutriente.MICRONUTRIENTI);
        Nutriente colesterolo = new Nutriente("colesterolo", TipoNutriente.MICRONUTRIENTI);
        Nutriente betacarotene = new Nutriente("betacarotene", TipoNutriente.MICRONUTRIENTI);

        String nome = "PastaConTonnoh";
        
        HashMap<Nutriente, Float> valoriNutrizionali = new HashMap<Nutriente, Float>();
        valoriNutrizionali.put(vitaminaC, 1000f);
        valoriNutrizionali.put(ferro, 1000f);
        valoriNutrizionali.put(calcio, 1000f);
        valoriNutrizionali.put(zinco, 1000f);
        valoriNutrizionali.put(colesterolo, 1000f);
        valoriNutrizionali.put(betacarotene, 1000f);
        valoriNutrizionali.put(glucidi, 1000f);
        valoriNutrizionali.put(vitaminaB1, 1000f);
        valoriNutrizionali.put(lipidi, 1000f);
        valoriNutrizionali.put(proteine, 1000f);

        Alimento alimento1 = new Alimento(nome, valoriNutrizionali);

        String nomeZuppetta = "Zuppetta";

        HashMap<Nutriente, Float> valoriNutrizionaliZuppetta = new HashMap<Nutriente, Float>();

        valoriNutrizionaliZuppetta.put(colesterolo, 100000000f);
        valoriNutrizionaliZuppetta.put(lipidi, 100000000f);
        valoriNutrizionaliZuppetta.put(betacarotene, 100000000f);

        Alimento alimento2 = new Alimento(nomeZuppetta, valoriNutrizionaliZuppetta);

        db.addAlimento(alimento1);
        db.addAlimento(alimento2);
    }

    @Test
    private void testGettersPaziente(){
        AlimentiController controller = new AlimentiController();
        Nutriente proteine = new Nutriente("Proteine", TipoNutriente.MACRONUTRIENTI);
        Nutriente lipidi = new Nutriente("lipidi", TipoNutriente.MACRONUTRIENTI);
        Nutriente glucidi = new Nutriente("glucidi", TipoNutriente.MACRONUTRIENTI);
        
        Nutriente vitaminaB1 = new Nutriente("vitaminaB1", TipoNutriente.MICRONUTRIENTI);
        Nutriente vitaminaC = new Nutriente("vitaminaC", TipoNutriente.MICRONUTRIENTI);
        Nutriente ferro = new Nutriente("ferro", TipoNutriente.MICRONUTRIENTI);
        Nutriente calcio = new Nutriente("calcio", TipoNutriente.MICRONUTRIENTI);
        Nutriente zinco = new Nutriente("zinco", TipoNutriente.MICRONUTRIENTI);
        Nutriente colesterolo = new Nutriente("colesterolo", TipoNutriente.MICRONUTRIENTI);
        Nutriente betacarotene = new Nutriente("betacarotene", TipoNutriente.MICRONUTRIENTI);

        HashMap<Nutriente, Float> valoriNutrizionali = new HashMap<Nutriente, Float>();
        valoriNutrizionali.put(vitaminaC, 1000f);
        valoriNutrizionali.put(ferro, 1000f);
        valoriNutrizionali.put(calcio, 1000f);
        valoriNutrizionali.put(zinco, 1000f);
        valoriNutrizionali.put(colesterolo, 1000f);
        valoriNutrizionali.put(betacarotene, 1000f);
        valoriNutrizionali.put(glucidi, 1000f);
        valoriNutrizionali.put(vitaminaB1, 1000f);
        valoriNutrizionali.put(lipidi, 1000f);
        valoriNutrizionali.put(proteine, 1000f);

        Alimento alimento1 = controller.getAlimento("PastaConTonnoh");
        assertEquals("PastaConTonnoh", alimento1.getNome());
        assertEquals(valoriNutrizionali, alimento1.getValoriNutrizionali());
        
    }

    @Test
    private void testAddAlimento(){
        AlimentiController controller = new AlimentiController();

        Nutriente lipidi = new Nutriente("lipidi", TipoNutriente.MACRONUTRIENTI);
        Nutriente glucidi = new Nutriente("glucidi", TipoNutriente.MACRONUTRIENTI);
        
        Nutriente ferro = new Nutriente("ferro", TipoNutriente.MICRONUTRIENTI);
        Nutriente calcio = new Nutriente("calcio", TipoNutriente.MICRONUTRIENTI);
        Nutriente colesterolo = new Nutriente("colesterolo", TipoNutriente.MICRONUTRIENTI);
        Nutriente betacarotene = new Nutriente("betacarotene", TipoNutriente.MICRONUTRIENTI);

        String nome = "CrudoCottoSalsiccia";
        
        HashMap<Nutriente, Float> valoriNutrizionali = new HashMap<Nutriente, Float>();
        valoriNutrizionali.put(ferro, 5000f);
        valoriNutrizionali.put(calcio, 100000f);
        valoriNutrizionali.put(colesterolo, 1f);
        valoriNutrizionali.put(betacarotene, 2000f);
        valoriNutrizionali.put(glucidi, 4000f);
        valoriNutrizionali.put(lipidi, 3000f);

        HashMap<String, Float> micronutrienti = new HashMap<String, Float>();
        HashMap<String, Float> macronutrienti = new HashMap<String, Float>();
        
        micronutrienti.put("lipidi", 3000f);
        micronutrienti.put("glucidi", 4000f);

        macronutrienti.put("ferro", 5000f);
        macronutrienti.put("calcio", 100000f);
        macronutrienti.put("colesterolo", 1f);
        macronutrienti.put("betacarotene", 2000f);
        
        Alimento alimento = new Alimento(nome, valoriNutrizionali);

        controller.addAlimento(nome, macronutrienti, micronutrienti);

        Alimento lastAlimento = controller.getAlimento(nome);

        assertEquals(alimento.getNome(), lastAlimento.getNome());
        assertEquals(alimento.getValoriNutrizionali(), lastAlimento.getValoriNutrizionali());
    }

}