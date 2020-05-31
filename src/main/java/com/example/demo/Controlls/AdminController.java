package com.example.demo.Controlls;

import com.example.demo.classes.Admin;
import com.example.demo.classes.Medecin;
import com.example.demo.classes.Patient;
import com.example.demo.repos.AdminRepo;
import com.example.demo.repos.MedecinRepo;
import com.example.demo.repos.PatientRepo;
import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
public class AdminController {
    @Autowired
    private AdminRepo adminRepo;
    @Autowired
    private PatientRepo patientRepo;
    @Autowired
    private MedecinRepo medecinRepo;

    @GetMapping("/admin/showalladmin")
    public List<Admin> showalladmin() {
        return adminRepo.findAll();
    }

    @PostMapping("/admin/addadmin")
    public Admin createMedecin(@RequestBody Admin admin) {
        return adminRepo.save(admin);
    }

    @PostMapping("/admin/addpatient")
    public Patient createPatient(@RequestBody Patient patient) {
        return patientRepo.save(patient);
    }

    @GetMapping("/admin/showallpatient")
    public List<Patient> showallpatient() {
        return patientRepo.findAll();
    }
    @GetMapping("/admin/showallmed")
    public List<Medecin> showallmed(){
        return medecinRepo.findAll();
    }

    @PostMapping("/admin/addmed")
    public Medecin createMedecin(  @RequestBody Medecin medecin) {
        return medecinRepo.save(medecin);
    }
}
