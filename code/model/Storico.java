package code.model;

import java.util.List;

public class Storico {
    
    private List<Scheda> storico;

    public Storico(List<Scheda> storico) {
        this.storico.addAll(storico);
    }

    public boolean aggiungiScheda(Scheda scheda){
        return this.storico.add(scheda);
    }

    public boolean modificaScheda(Scheda scheda){
        this.storico.remove(this.storico.size()-1);
        return this.storico.add(scheda);
    }

    public void rimuoviScheda(Scheda scheda){
        this.storico.remove(this.storico.size()-1);
    }
    
    public Scheda getScheda(int schedaId){
        return storico.get(schedaId);
    }
}
