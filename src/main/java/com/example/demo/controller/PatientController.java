package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Patient;
import com.example.demo.repository.PatientRepository;

@RestController
public class PatientController {

    @Autowired
    private PatientRepository repo;

    // GET ALL PATIENTS
    @GetMapping("/patients")
    public java.util.List<Patient> getPatients() {

        return repo.findAll();
    }

    // ADD PATIENT
    @PostMapping("/addPatient")
    public Patient addPatient(@RequestBody Patient patient) {

        return repo.save(patient);
    }
}