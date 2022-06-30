package com.example.evalspring.repository;

import com.example.evalspring.entity.Formateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormateurRepo extends JpaRepository<Formateur,Long> {
}
