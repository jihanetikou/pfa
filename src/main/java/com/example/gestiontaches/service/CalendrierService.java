package com.example.gestiontaches.service;

import com.example.gestiontaches.bean.Calendrier;
import com.example.gestiontaches.bean.Statut;
import com.example.gestiontaches.dao.CalendrierDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CalendrierService {

    @Autowired
    private CalendrierDao calendrierDao;

    public List<Calendrier> findAll() {return calendrierDao.findAll();}

    public  Calendrier save(Calendrier entity) {return calendrierDao.save(entity);}

    public  Calendrier findById(Long aLong) {return calendrierDao.findById(aLong).get();}

    public void deleteById(Long aLong) {calendrierDao.deleteById(aLong);}

    public void delete(Calendrier entity) {calendrierDao.delete(entity);}

    public Calendrier update(Long id, Calendrier calendrier) {
        Calendrier calendrier1 =new Calendrier();
        calendrier1=this.findById(id);
        calendrier1.setDateDebut(calendrier.getDateDebut());
        calendrier1.setDateFin(calendrier.getDateFin());
        calendrier1.setDuree(calendrier.getDuree());
        this.save(calendrier1);
        return calendrier1;
    }
}
