package com.example.demo.repos;

import com.example.demo.classes.Admin;
import com.example.demo.classes.Rdv;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RdvRepo   extends JpaRepository<Rdv, Integer> {
}
