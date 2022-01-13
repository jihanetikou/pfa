package com.example.gestiontaches.rest;

import com.example.gestiontaches.bean.Statut;
import com.example.gestiontaches.bean.Utilisateur;
import com.example.gestiontaches.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public Utilisateur findById(@PathVariable("id") Long id) {
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

    @PutMapping("/update/{id}")
    public Utilisateur update(@PathVariable long id, @RequestBody Utilisateur utilisateur) {
        return utilisateurService.update(id, utilisateur);
    }

}
