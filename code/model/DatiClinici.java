package code.model;

import java.nio.file.Path;

public class DatiClinici {

    String nome;
    Path file; 

    public DatiClinici() {
    }

    public DatiClinici(String nome, Path file) {
        this.nome = nome;
        this.file = file;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Path getFile() {
        return this.file;
    }

    public void setFile(Path file) {
        this.file = file;
    }

    public DatiClinici nome(String nome) {
        setNome(nome);
        return this;
    }

    public DatiClinici file(Path file) {
        setFile(file);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", file='" + getFile() + "'" +
            "}";
    }


}
