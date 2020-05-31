package com.example.demo.repos;

import com.example.demo.classes.Admin;
import com.example.demo.classes.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrescriptionRepo  extends JpaRepository<Prescription, Integer> {
}
