package com.example.gestiontaches.dao;

import com.example.gestiontaches.bean.Tache;
import com.example.gestiontaches.bean.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurDao extends JpaRepository<Utilisateur,Long> {
}
