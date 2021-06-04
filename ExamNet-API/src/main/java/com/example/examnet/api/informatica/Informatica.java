package com.example.examnet.api.informatica;

import javax.persistence.*;

@Entity
@Table(name = "informatica", schema = "examnet")
public class Informatica {
    private int id;
    private String enunt;
    private String variante;
    private String raspuns;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "enunt")
    public String getEnunt() {
        return enunt;
    }

    public void setEnunt(String enunt) {
        this.enunt = enunt;
    }

    @Basic
    @Column(name = "variante")
    public String getVariante() {
        return variante;
    }

    public void setVariante(String variante) {
        this.variante = variante;
    }

    @Basic
    @Column(name = "raspuns")
    public String getRaspuns() {
        return raspuns;
    }

    public void setRaspuns(String raspuns) {
        this.raspuns = raspuns;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Informatica that = (Informatica) o;

        if (id != that.id) return false;
        if (enunt != null ? !enunt.equals(that.enunt) : that.enunt != null) return false;
        if (variante != null ? !variante.equals(that.variante) : that.variante != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (enunt != null ? enunt.hashCode() : 0);
        result = 31 * result + (variante != null ? variante.hashCode() : 0);
        return result;
    }
}
