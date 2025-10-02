package com.patient_admission.model.patient;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "patients")
@Data
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Pname", nullable = false)
    private String pname;

    @Column(name = "Pemail", unique = true, nullable = false)
    private String pemail;

    @Column(name = "PphnNo", length = 15, nullable = false)
    private String pphnno;

    @Column(name = "Pdob")
    private String pdob;

    @Column(name = "Pgender")
    private String pgender;

    @Column(name = "Ppswd", nullable = false)
    private String ppswd;


}
