package com.example.gestiontaches.rest;

import com.example.gestiontaches.bean.Tache;
import com.example.gestiontaches.bean.Utilisateur;
import com.example.gestiontaches.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/utilisateur")
public class UtilisateurWs {
    @Autowired
    private UtilisateurService utilisateurService;

    @GetMapping("/")
    public List<Utilisateur> findAll() {
        return utilisateurService.findAll();
    }

    @PostMapping("/")
    public Utilisateur save(@RequestBody Utilisateur utilisateur) {
        return utilisateurService.save(utilisateur);
    }

    @GetMapping("/id/{id}")
    public Optional<Utilisateur> findById(Long id) {
        return utilisateurService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        utilisateurService.deleteById(id);
    }

    @DeleteMapping("/")
    public void delete(Utilisateur entity) {
        utilisateurService.delete(entity);
    }
}
