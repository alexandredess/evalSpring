package com.example.evalspring.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "sujet")
public class Sujet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column (name = "nom")
    @Size(max = 50)
    @NotNull
    private String nom;
    @Column (name = "duree")
    private int durée;
    @Column (name="difficulte")
    @Size(max = 50)
    private String difficulté;
    @ManyToMany(mappedBy = "sujet")
    private List<Formateur> formateurs;
    public Sujet(){

    }

    public Sujet(Long id) {
        this.id = id;
    }

    public Sujet(Long id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Sujet(Long id, String nom, int durée) {
        this.id = id;
        this.nom = nom;
        this.durée = durée;
    }

    public Sujet(Long id, String nom, int durée, String difficulté) {
        this.id = id;
        this.nom = nom;
        this.durée = durée;
        this.difficulté = difficulté;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDurée() {
        return durée;
    }

    public void setDurée(int durée) {
        this.durée = durée;
    }

    public String getDifficulté() {
        return difficulté;
    }

    public void setDifficulté(String difficulté) {
        this.difficulté = difficulté;
    }
}
