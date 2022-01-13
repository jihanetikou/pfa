package com.example.gestiontaches.dao;

import com.example.gestiontaches.bean.Calendrier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalendrierDao extends JpaRepository<Calendrier,Long> {
}
