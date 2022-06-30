package com.example.evalspring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

@Entity
@Table(name = "adresse")
public class Adresse {
    @Id
    private Long id;
    @Column (name = "rue")
    @Size(max=255)
    private String rue;
    @Column (name = "adresse")
    @Size(max=255)
    private String complementAdresse;
    @Column (name = "codePostal")
    @Size(max=10)
    private String codePostal;
    @Column (name = "ville")
    @Size(max=50)
    private String ville;
    @Column (name = "pays")
    @Size(max=50)
    private String Pays;

    public Adresse(){

    }
    public Adresse(Long id) {
        this.id = id;
    }

    public Adresse(Long id, String rue) {
        this.id = id;
        this.rue = rue;
    }

    public Adresse(Long id, String rue, String complementAdresse) {
        this.id = id;
        this.rue = rue;
        this.complementAdresse = complementAdresse;
    }

    public Adresse(Long id, String rue, String complementAdresse, String codePostal) {
        this.id = id;
        this.rue = rue;
        this.complementAdresse = complementAdresse;
        this.codePostal = codePostal;
    }
    
}
