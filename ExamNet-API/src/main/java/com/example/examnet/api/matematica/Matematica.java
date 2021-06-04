package com.example.examnet.api.matematica;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "matematica", schema = "examnet")
public class Matematica {
    private int id;
    private String enunt;
    private String variante;
    private String raspuns;

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
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
    public boolean equals(Object o ) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Matematica that = (Matematica) o;

        if (id != that.id) return false;
        if (enunt != that.enunt) return false;
        if (variante != null ? !variante.equals(that.variante) : that.variante != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
