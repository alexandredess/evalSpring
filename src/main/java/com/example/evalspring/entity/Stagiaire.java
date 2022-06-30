package com.example.evalspring.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@DiscriminatorValue("s")
public class Stagiaire extends Personne{
    @Column (name = "dateNaissance")
    @Temporal(TemporalType.DATE)
    private Date datenaissance;
    @Column (name = "formateur")
    @ManyToOne
    private Formateur formateur;

    public Stagiaire(Long id, String civilite, String nom, String prenom, String email, Date datenaissance) {
        super(id, civilite, nom, prenom, email);
        this.datenaissance = datenaissance;
    }

    public Stagiaire(Long id, String civilite, String nom, String prenom, String email, Date datenaissance, Formateur formateur) {
        super(id, civilite, nom, prenom, email);
        this.datenaissance = datenaissance;
        this.formateur = formateur;
    }

    public Stagiaire() {

    }

    public Date getDatenaissance() {
        return datenaissance;
    }

    public void setDatenaissance(Date datenaissance) {
        this.datenaissance = datenaissance;
    }
}
