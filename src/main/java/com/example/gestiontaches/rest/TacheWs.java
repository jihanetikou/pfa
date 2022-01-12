package com.example.gestiontaches.rest;

import com.example.gestiontaches.bean.Tache;
import com.example.gestiontaches.service.TacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/tache")
public class TacheWs {
    @Autowired
    private TacheService tacheService;

    @GetMapping("/")
    public List<Tache> findAll() {
        return tacheService.findAll();
    }

    @PostMapping("/")
    public Tache save(@RequestBody Tache tache) {
        return tacheService.save(tache);
    }

    @GetMapping("/id/{id}")
    public Optional<Tache> findById(@PathVariable Long id) {
        return tacheService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        tacheService.deleteById(id);
    }

    @DeleteMapping("/")
    public void deleteAll() {
        tacheService.deleteAll();
    }
}
