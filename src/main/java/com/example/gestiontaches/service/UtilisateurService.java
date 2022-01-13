package com.example.gestiontaches.service;

import com.example.gestiontaches.bean.Statut;
import com.example.gestiontaches.bean.Tache;
import com.example.gestiontaches.bean.Utilisateur;
import com.example.gestiontaches.dao.UtilisateurDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UtilisateurService {

    @Autowired
    private UtilisateurDao utilisateurDao;

    public List<Utilisateur> findAll() {
        return utilisateurDao.findAll();
    }

    public Utilisateur save(Utilisateur utilisateur) {
        return utilisateurDao.save(utilisateur);
    }

    public Utilisateur findById(Long aLong) {
        return utilisateurDao.findById(aLong).get();
    }

    public void deleteById(Long aLong) {
        utilisateurDao.deleteById(aLong);
    }

    public void delete(Utilisateur entity) {
        utilisateurDao.delete(entity);
    }

    public Utilisateur update(long id, Utilisateur utilisateur) {
        Utilisateur utilisateur1=new Utilisateur();
        utilisateur1=this.findById(id);
        utilisateur1.setNom(utilisateur.getNom());
        utilisateur1.setPrenom(utilisateur.getPrenom());
        utilisateur1.setTaches(utilisateur.getTaches());
        this.save(utilisateur1);
        return utilisateur1;
    }
}
