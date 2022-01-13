package com.example.gestiontaches.rest;

import com.example.gestiontaches.bean.Statut;
import com.example.gestiontaches.service.StatutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/statut")
public class StatutWs {
    @Autowired
    private StatutService statutService;

    @GetMapping("/")
    public List<Statut> findAll() { return statutService.findAll(); }

    @PostMapping("/")
    @ResponseBody
    public Statut save(@RequestBody Statut statut) { return statutService.save(statut); }

    @GetMapping("/id/{id}")
    public Statut findById(@PathVariable("id") Long id) { return statutService.findById(id); }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") Long id) { statutService.deleteById(id); }

    @DeleteMapping("/")
    public void deleteAll() { statutService.deleteAll(); }

    @PutMapping("/update/{id}")
    public Statut update(@PathVariable long id, @RequestBody Statut statut) {
        return statutService.update(id, statut);
    }
}
