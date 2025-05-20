package com.cvshealth.pct.repository;

import com.cvshealth.pct.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
