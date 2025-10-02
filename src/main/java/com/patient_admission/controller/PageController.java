package com.patient_admission.controller;

// import com.patient_admission.Services.patient.PatientService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// Common Controller (landing page)
@Controller
public class PageController {

    // Landing Page
    @GetMapping("/")
    public String homePage(){
        return "index";
    }


}
