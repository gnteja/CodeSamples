package com.learngn.springdatajpa.patientscheduling.repository;

import org.springframework.data.repository.CrudRepository;

import com.learngn.springdatajpa.patientscheduling.entity.Patient;

public interface PatientRepo extends CrudRepository<Patient, Long> {

}
