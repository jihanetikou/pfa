package com.example.gestiontaches.service;

import com.example.gestiontaches.bean.Tache;
import com.example.gestiontaches.dao.TacheDao;
import com.example.gestiontaches.dao.UtilisateurDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TacheService {
    @Autowired
    private TacheDao tacheDao;

    public List<Tache> findAll() {
        return tacheDao.findAll();
    }

    public Tache save(Tache tache) {
        return tacheDao.save(tache);
    }

    public Optional<Tache> findById(Long aLong) {
        return tacheDao.findById(aLong);
    }

    public void deleteAll() {
        tacheDao.deleteAll();
    }

    public void deleteById(Long aLong) {
        tacheDao.deleteById(aLong);
    }

    public void delete(Tache entity) {
        tacheDao.delete(entity);
    }
}
