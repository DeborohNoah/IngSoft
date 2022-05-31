package code.model;

import java.time.LocalDate;
import java.time.LocalTime;


public class Appuntamento {

    private LocalDate data;
    private LocalTime oraInizio;
    private LocalTime oraFine;
    private Paziente paziente;


    public Appuntamento() {
    }

    public Appuntamento(LocalDate data, LocalTime oraInizio, LocalTime oraFine, Paziente paziente) {
        this.data = data;
        this.oraInizio = oraInizio;
        this.oraFine = oraFine;
        this.paziente = paziente;
    }

    public LocalDate getData() {
        return this.data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getOraInizio() {
        return this.oraInizio;
    }

    public void setOraInizio(LocalTime oraInizio) {
        this.oraInizio = oraInizio;
    }

    public LocalTime getOraFine() {
        return this.oraFine;
    }

    public void setOraFine(LocalTime oraFine) {
        this.oraFine = oraFine;
    }

    public Paziente getPaziente() {
        return this.paziente;
    }

    public void setPaziente(Paziente paziente) {
        this.paziente = paziente;
    }

    public Appuntamento data(LocalDate data) {
        setData(data);
        return this;
    }

    public Appuntamento oraInizio(LocalTime oraInizio) {
        setOraInizio(oraInizio);
        return this;
    }

    public Appuntamento oraFine(LocalTime oraFine) {
        setOraFine(oraFine);
        return this;
    }

    public Appuntamento paziente(Paziente paziente) {
        setPaziente(paziente);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " data='" + getData() + "'" +
            ", oraInizio='" + getOraInizio() + "'" +
            ", oraFine='" + getOraFine() + "'" +
            ", paziente='" + getPaziente() + "'" +
            "}";
    }


}