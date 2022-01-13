package com.example.gestiontaches.bean;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Calendrier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateDebut;
    private Date dateFin;
    private int duree;
    @OneToMany(targetEntity = Tache.class)
    @JsonManagedReference
    private List<Tache> taches;

    public Long getId() {return id;}

    public void setId(Long id) { this.id = id;}

    public Date getDateDebut() {return dateDebut;}

    public void setDateDebut(Date dateDebut) { this.dateDebut = dateDebut; }

    public Date getDateFin() { return dateFin;}

    public void setDateFin(Date dateFin) {this.dateFin = dateFin;}

    public int getDuree() {return duree;}

    public void setDuree(int duree) { this.duree = duree;}

    public List<Tache> getTaches() { return taches;}

    public void setTaches(List<Tache> taches) { this.taches = taches;}
}
