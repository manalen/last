package com.example.demo.Controlls;


import ch.qos.logback.core.net.SyslogOutputStream;
import com.example.demo.classes.Consultation;
import com.example.demo.classes.Medecin;
import com.example.demo.classes.Patient;
import com.example.demo.classes.ResourceNotFoundException;
import com.example.demo.repos.ConsulRepo;
import com.example.demo.repos.MedecinRepo;
import com.example.demo.repos.PatientRepo;
import org.hibernate.annotations.GeneratorType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class MedecinController {
    @Autowired
    private MedecinRepo medecinRepo;
    @Autowired
    private ConsulRepo consulRepo;
    @Autowired
    private PatientRepo patientRepo;

    @GetMapping("/med/showallconsu")
    public List<Consultation> showallconsu() {
        return consulRepo.findAll();
    }

    @PostMapping("/med/{medid}/addconsu/{patientid}")
    public Consultation createconsu(@PathVariable(value = "medid") int medid, @PathVariable(value="patientid") int patientid,@RequestBody Consultation consultation) {
        return medecinRepo.findById(medid).map(medecin -> {
            consultation.setMedecin(medecin);
            consultation.setPatient(patientRepo.findById(patientid).get());
            return consulRepo.save(consultation);
        }).orElseThrow(() -> new ResourceNotFoundException("medecin id " + medid + " not found"));

    }
    @GetMapping("/med/showallpatient")
    public List<Patient> showallpatient() {
        System.out.println("hello");
        return patientRepo.findAll();
    }

    @GetMapping("/med/showpatientbyid/{id}")
    public Patient showpatientbyid(@PathVariable(value="id") int id) {
        return patientRepo.findById(id).get();
    }

    @GetMapping("/med/showapatientbyname/{nom}")
    public List<Patient> showpatientbyname(@PathVariable(value="nom") String nom ) {
        return patientRepo.findByNom(nom);
    }

    @GetMapping("/med/showpatientbycin/{cin}")
    public List<Patient> showpatientbycin(@PathVariable String cin) {
        return patientRepo.findByCin(cin);
    }

    @GetMapping("/med/showpatientbynum/{numserie}")
    public List<Patient> showpatientbynum(@PathVariable int numserie) {
        return patientRepo.findByNumserie(numserie);
    }
    @GetMapping("/med/showpatientbynomprenom/{nom}/{prenom}")
    public List<Patient> showbynomprenom(@PathVariable String nom , @PathVariable String prenom) {
        return patientRepo.findPatientByNomandPrenom(nom,prenom);
    }


}