package code.model;

import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class Scheda {
    
    private int schedaId;
    private float peso; 
    private float circonferenzaVita;
    private float circonferenzaFianchi;
    private float plicaTricipitale;
    private float plicaSottoscapolare;
    private float plicaSovrailliaca;
    private float plicaAddominale;
    private float plicaBicipitale;
    private float plicaQuadricipitale;
    Map<String, Path> datiClinici;
    Dieta dieta;


    public Scheda() {
    }

    public Scheda(int schedaId, float peso, float circonferenzaVita, float circonferenzaFianchi, 
                float plicaTricipitale, float plicaSottoscapolare, float plicaSovrailliaca, float plicaAddominale,
                float plicaBicipitale, float plicaQuadricipitale, Map<String, Path> datiClinici, Dieta dieta) {
        this.schedaId = schedaId;
        this.peso = peso;
        this.circonferenzaVita = circonferenzaVita;
        this.circonferenzaFianchi = circonferenzaFianchi;
        this.plicaTricipitale = plicaTricipitale;
        this.plicaSottoscapolare = plicaSottoscapolare;
        this.plicaSovrailliaca = plicaSovrailliaca;
        this.plicaAddominale = plicaAddominale;
        this.plicaBicipitale = plicaBicipitale;
        this.plicaQuadricipitale = plicaQuadricipitale;
        this.datiClinici = datiClinici;
    }

    public Map<String, Float> getMisure(){
        HashMap<String, Float> misure = new HashMap<String, Float>();
        misure.put("circonferenzaVita", circonferenzaVita);
        misure.put("circonferenzaFianchi", circonferenzaFianchi);
        misure.put("plicaTricipitale", plicaTricipitale);
        misure.put("peso", peso);
        misure.put("plicaSottoscapolare", plicaSottoscapolare);
        misure.put("plicaSovrailliaca", plicaSovrailliaca);
        misure.put("plicaAddominale", plicaAddominale);
        misure.put("plicaBicipitale", plicaBicipitale);
        misure.put("plicaQuadricipitale", plicaQuadricipitale);
        return misure;
    }

    public Map<String, Path> getDatiClinici(){
        return datiClinici;
    }
    public Dieta getDieta(){
        return this.dieta;
    }
    public int getSchedaId(){
        return schedaId;
    }
    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getCirconferenzaVita() {
        return this.circonferenzaVita;
    }

    public void setCirconferenzaVita(float circonferenzaVita) {
        this.circonferenzaVita = circonferenzaVita;
    }

    public float getCirconferenzaFianchi() {
        return this.circonferenzaFianchi;
    }

    public void setCirconferenzaFianchi(float circonferenzaFianchi) {
        this.circonferenzaFianchi = circonferenzaFianchi;
    }

    public float getPlicaTricipitale() {
        return this.plicaTricipitale;
    }

    public void setPlicaTricipitale(float plicaTricipitale) {
        this.plicaTricipitale = plicaTricipitale;
    }

    public float getPlicaSottoscapolare() {
        return this.plicaSottoscapolare;
    }

    public void setPlicaSottoscapolare(float plicaSottoscapolare) {
        this.plicaSottoscapolare = plicaSottoscapolare;
    }

    public float getPlicaSovrailliaca() {
        return this.plicaSovrailliaca;
    }

    public void setPlicaSovrailliaca(float plicaSovrailliaca) {
        this.plicaSovrailliaca = plicaSovrailliaca;
    }

    public float getPlicaAddominale() {
        return this.plicaAddominale;
    }

    public void setPlicaAddominale(float plicaAddominale) {
        this.plicaAddominale = plicaAddominale;
    }

    public float getPlicaBicipitale() {
        return this.plicaBicipitale;
    }

    public void setPlicaBicipitale(float plicaBicipitale) {
        this.plicaBicipitale = plicaBicipitale;
    }

    public float getPlicaQuadricipitale() {
        return this.plicaQuadricipitale;
    }

    public void setPlicaQuadricipitale(float plicaQuadricipitale) {
        this.plicaQuadricipitale = plicaQuadricipitale;
    }

    public Scheda peso(float peso) {
        setPeso(peso);
        return this;
    }

    public Scheda circonferenzaVita(float circonferenzaVita) {
        setCirconferenzaVita(circonferenzaVita);
        return this;
    }

    public Scheda circonferenzaFianchi(float circonferenzaFianchi) {
        setCirconferenzaFianchi(circonferenzaFianchi);
        return this;
    }

    public Scheda plicaTricipitale(float plicaTricipitale) {
        setPlicaTricipitale(plicaTricipitale);
        return this;
    }

    public Scheda plicaSottoscapolare(float plicaSottoscapolare) {
        setPlicaSottoscapolare(plicaSottoscapolare);
        return this;
    }

    public Scheda plicaSovrailliaca(float plicaSovrailliaca) {
        setPlicaSovrailliaca(plicaSovrailliaca);
        return this;
    }

    public Scheda plicaAddominale(float plicaAddominale) {
        setPlicaAddominale(plicaAddominale);
        return this;
    }

    public Scheda plicaBicipitale(float plicaBicipitale) {
        setPlicaBicipitale(plicaBicipitale);
        return this;
    }

    public Scheda plicaQuadricipitale(float plicaQuadricipitale) {
        setPlicaQuadricipitale(plicaQuadricipitale);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " peso='" + getPeso() + "'" +
            ", circonferenzaVita='" + getCirconferenzaVita() + "'" +
            ", circonferenzaFianchi='" + getCirconferenzaFianchi() + "'" +
            ", plicaTricipitale='" + getPlicaTricipitale() + "'" +
            ", plicaSottoscapolare='" + getPlicaSottoscapolare() + "'" +
            ", plicaSovrailliaca='" + getPlicaSovrailliaca() + "'" +
            ", plicaAddominale='" + getPlicaAddominale() + "'" +
            ", plicaBicipitale='" + getPlicaBicipitale() + "'" +
            ", plicaQuadricipitale='" + getPlicaQuadricipitale() + "'" +
            "}";
    }

  
}
