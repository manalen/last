package com.example.demo.repos;

import com.example.demo.classes.Admin;
import com.example.demo.classes.Analyse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnalyseRepo  extends JpaRepository<Analyse, Integer> {
}
