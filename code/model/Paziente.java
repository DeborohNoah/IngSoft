package code.model;

import java.time.LocalDate;

public class Paziente {
    
    int pazienteId;
    String nome;
    String cognome;
    LocalDate dataNascita;
    String telefono;
    String mail;


    public Paziente() {
    }

    public Paziente(String nome, String cognome, LocalDate dataNascita, String telefono, String mail) {
        this.pazienteId = 1;
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.telefono = telefono;
        this.mail = mail;
    }

    public int getPazienteId() {
        return this.pazienteId;
    }

    public void setPazienteId(int pazienteId) {
        this.pazienteId = pazienteId;
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

    public Paziente pazienteId(int pazienteId) {
        setPazienteId(pazienteId);
        return this;
    }

    public Paziente nome(String nome) {
        setNome(nome);
        return this;
    }

    public Paziente cognome(String cognome) {
        setCognome(cognome);
        return this;
    }

    public Paziente dataNascita(LocalDate dataNascita) {
        setDataNascita(dataNascita);
        return this;
    }

    public Paziente telefono(String telefono) {
        setTelefono(telefono);
        return this;
    }

    public Paziente mail(String mail) {
        setMail(mail);
        return this;
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
