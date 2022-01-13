package com.example.gestiontaches.dao;

import com.example.gestiontaches.bean.Statut;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatutDao extends JpaRepository<Statut,Long> {
}
