package com.example.gestiontaches.dao;

import com.example.gestiontaches.bean.Tache;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TacheDao extends JpaRepository<Tache,Long> {
}
