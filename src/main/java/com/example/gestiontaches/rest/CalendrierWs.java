package com.example.gestiontaches.rest;

import com.example.gestiontaches.bean.Calendrier;
import com.example.gestiontaches.dao.CalendrierDao;
import com.example.gestiontaches.service.CalendrierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Access;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/calendrier")
public class CalendrierWs {
    @Autowired
    private CalendrierService calendrierService;

    @GetMapping("/")
    public List<Calendrier> findAll() {return calendrierService.findAll();}

    @PostMapping("/")
    public Calendrier save(@RequestBody Calendrier entity) {return calendrierService.save(entity);}

    @GetMapping("/id/{id}")
    public Calendrier findById(@PathVariable Long id) {return calendrierService.findById(id);}

    @DeleteMapping("/id/{id}")
    public void deleteById(@PathVariable Long id) {calendrierService.deleteById(id);}

    @DeleteMapping("/")
    public void delete(Calendrier entity) { calendrierService.delete(entity);}

    public Calendrier update(Long id, Calendrier calendrier) {
        return calendrierService.update(id, calendrier);
    }
}
