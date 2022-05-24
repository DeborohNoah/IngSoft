package code.model;

import java.time.LocalDate;
import java.util.List;

public class Paziente {
    
    int pazienteId;
    String nome;
    String cognome;
    LocalDate dataNascita;
    String telefono;
    String mail;
    Storico storico;

    public Paziente(){

    }


    public Paziente(String nome, String cognome, LocalDate dataNascita, String telefono, String mail, List<Scheda> storico) {
        this.pazienteId = 1;
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.telefono = telefono;
        this.mail = mail;
        this.storico = new Storico(storico);
    }

    public int getPazienteId() {
        return this.pazienteId;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return this.cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public LocalDate getDataNascita() {
        return this.dataNascita;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return this.mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
   
    public Storico getStorico(){
        return this.storico;
    }

    @Override
    public String toString() {
        return "{" +
            " pazienteId='" + getPazienteId() + "'" +
            ", nome='" + getNome() + "'" +
            ", cognome='" + getCognome() + "'" +
            ", dataNascita='" + getDataNascita() + "'" +
            ", telefono='" + getTelefono() + "'" +
            ", mail='" + getMail() + "'" +
            "}";
    }



}
