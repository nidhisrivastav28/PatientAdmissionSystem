package com.patient_admission.repository.patient;

import com.patient_admission.model.patient.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PatientRepo extends JpaRepository<Patient, Long> {
    Optional<Patient> findByPemail(String pemail);
}
