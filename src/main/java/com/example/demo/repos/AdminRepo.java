package com.example.demo.repos;

import com.example.demo.classes.Admin;
import com.example.demo.classes.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepo extends JpaRepository<Admin, Integer> {
}
