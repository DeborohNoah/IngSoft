package code.model;

public class Soglia {
    private Nutriente nutriente;
    private int min;
    private int max;

    public Soglia() {
    }

    public Soglia(Nutriente nutriente, int min, int max) {
        this.nutriente = nutriente;
        this.min = min;
        this.max = max;
    }

    public Nutriente getNutriente() {
        return this.nutriente;
    }

    public void setNutriente(Nutriente nutriente) {
        this.nutriente = nutriente;
    }

    public int getMin() {
        return this.min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return this.max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public boolean equals(Object o){
       return ((Soglia) o).getNutriente().equals(this.getNutriente());
    }

}
