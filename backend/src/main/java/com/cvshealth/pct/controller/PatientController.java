package com.cvshealth.pct.controller;

import com.cvshealth.pct.model.Patient;
import com.cvshealth.pct.repository.PatientRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/patients")
@CrossOrigin(origins = "*")
public class PatientController {

    private final PatientRepository patientRepo;

    public PatientController(PatientRepository patientRepo) {
        this.patientRepo = patientRepo;
    }

    @GetMapping
    public List<Patient> getAllPatients() {
        return patientRepo.findAll();
    }

    @PostMapping
    public Patient createPatient(@RequestBody Patient patient) {
        return patientRepo.save(patient);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Patient> updatePatient(@PathVariable Long id, @RequestBody Patient updated) {
        Optional<Patient> optional = patientRepo.findById(id);
        if (optional.isEmpty()) return ResponseEntity.notFound().build();

        Patient existing = optional.get();
        existing.setName(updated.getName());
        existing.setEmail(updated.getEmail());
        existing.setPhone(updated.getPhone());

        return ResponseEntity.ok(patientRepo.save(existing));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePatient(@PathVariable Long id) {
        if (!patientRepo.existsById(id)) return ResponseEntity.notFound().build();
        patientRepo.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
