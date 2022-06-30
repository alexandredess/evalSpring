package com.example.evalspring.repository;

import com.example.evalspring.entity.Stagiaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StagiaireRepo extends JpaRepository <Stagiaire,Long> {
}
