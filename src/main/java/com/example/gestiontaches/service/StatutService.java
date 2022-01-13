package com.example.gestiontaches.service;

import com.example.gestiontaches.bean.Statut;
import com.example.gestiontaches.dao.StatutDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StatutService {
    @Autowired
    private StatutDao statutDao;

    public List<Statut> findAll() {
        return statutDao.findAll();
    }

    public Statut save(Statut entity) {
        return statutDao.save(entity);
    }

    public Statut findById(Long aLong) {
        return statutDao.findById(aLong).get();
    }

    public void deleteById(Long aLong) {
        statutDao.deleteById(aLong);
    }

    public void deleteAll() {
        statutDao.deleteAll();
    }

    public Statut update(long id, Statut statut) {
        Statut statut1=new Statut();
        statut1=this.findById(id);
        statut1.setNumero(statut.getNumero());
        statut1.setDescription(statut.getDescription());
        statut1.setTaches(statut.getTaches());
        this.save(statut1);
        return statut1;
    }
}
