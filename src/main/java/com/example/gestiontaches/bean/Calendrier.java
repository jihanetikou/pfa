package com.example.gestiontaches.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonSetter;

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
    @OneToMany(mappedBy = "calendrier")
    private List<Tache> taches;

    public Long getId() {return id;}

    public void setId(Long id) { this.id = id;}

    public Date getDateDebut() {return dateDebut;}

    public void setDateDebut(Date dateDebut) { this.dateDebut = dateDebut; }

    public Date getDateFin() { return dateFin;}

    public void setDateFin(Date dateFin) {this.dateFin = dateFin;}

    public int getDuree() {return duree;}

    public void setDuree(int duree) { this.duree = duree;}

    @JsonIgnore
    public List<Tache> getTaches() { return taches;}

    @JsonSetter
    public void setTaches(List<Tache> taches) { this.taches = taches;}

    @Override
    public String toString() {
        return "Calendrier{" +
                "id=" + id +
                ", dateDebut=" + dateDebut +
                ", dateFin=" + dateFin +
                ", duree=" + duree +
                ", taches=" + taches +
                '}';
    }
}
