package com.example.evalspring.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
@DiscriminatorValue("f")
public class Formateur extends Personne{
    @Column (name = "dateEmbauche")
    @Temporal(TemporalType.DATE)
    @NotNull
    private Date dateEmbauche;
    @Column (name = "experience")
    private int experiece;
    @Column (name = "status")
    private boolean status;
    @OneToMany
    @JoinColumn(name = "personne_id")
    private List<Stagiaire> stagiaires;

    @ManyToMany
    @JoinTable(name = "experience",joinColumns = @JoinColumn(name = "personne_id"),
            inverseJoinColumns = @JoinColumn(name = "sujet_id"))
    private List<Sujet> sujets;

    public Formateur(Date dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    public Formateur(Date dateEmbauche, int experiece) {
        this.dateEmbauche = dateEmbauche;
        this.experiece = experiece;
    }

    public Formateur(Date dateEmbauche, int experiece, boolean status) {
        this.dateEmbauche = dateEmbauche;
        this.experiece = experiece;
        this.status = status;
    }

    public Formateur(Long id, String civilite, String nom, String prenom, String email, Date dateEmbauche, int experiece, boolean status) {
        super(id, civilite, nom, prenom, email);
        this.dateEmbauche = dateEmbauche;
        this.experiece = experiece;
        this.status = status;
    }

    public Formateur() {

    }

    public Date getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(Date dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    public int getExperiece() {
        return experiece;
    }

    public void setExperiece(int experiece) {
        this.experiece = experiece;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<Stagiaire> getStagiaires() {
        return stagiaires;
    }

    public void setStagiaires(List<Stagiaire> stagiaires) {
        this.stagiaires = stagiaires;
    }
}
