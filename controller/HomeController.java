package com.example.demo.controller;

import com.example.demo.entity.Patient;
import com.example.demo.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private PatientRepository patientRepository;

    @GetMapping("/")
    public String home(Model model) {

        List<Patient> patients = patientRepository.findAll();

        model.addAttribute("patients", patients);

        return "index";
    }
}