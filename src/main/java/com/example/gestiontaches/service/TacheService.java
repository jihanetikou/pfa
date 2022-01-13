package com.example.gestiontaches.service;

import com.example.gestiontaches.bean.Statut;
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

    public Tache findById(Long aLong) {
        return tacheDao.findById(aLong).get();
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

    public Tache update(long id, Tache tache) {
        Tache tache1=new Tache();
        tache1=this.findById(id);
        tache1.setTitre(tache.getTitre());
        tache1.setDescription(tache.getDescription());
        tache1.setDateCreation(tache.getDateCreation());
        tache1.setIdProject(tache.getIdProject());
        tache1.setIdTicket(tache.getIdTicket());
        tache1.setStatut(tache.getStatut());
        tache1.setUtilisateur(tache.getUtilisateur());
        this.save(tache1);
        return tache1;
    }
}
