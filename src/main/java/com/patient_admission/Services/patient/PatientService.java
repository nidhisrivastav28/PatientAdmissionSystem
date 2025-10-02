package com.patient_admission.Services.patient;

import com.patient_admission.model.patient.Patient;
import com.patient_admission.repository.patient.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

    @Autowired
    private PatientRepo patientRepo;

    // Registration Method
    public Patient registerPatient(Patient patient, String cpswd) {
        // Check if passwords match
        if (!patient.getPpswd().equals(cpswd)) {
            throw new RuntimeException("Passwords do not match");
        }

        // Check if email already exists
        if (patientRepo.findByPemail(patient.getPemail()).isPresent()) {
            throw new RuntimeException("Email already registered");
        }

        // Save patient to DB
        return patientRepo.save(patient);
    }

    // Login Validation
    public Patient validateUser(String email, String pswd){
        // Fetch patient by email
        Patient user = patientRepo.findByPemail(email).orElse(null);

        // Check password
        if(user != null && user.getPpswd().equals(pswd)){
            return user;
        }
        return null;
    }


}
