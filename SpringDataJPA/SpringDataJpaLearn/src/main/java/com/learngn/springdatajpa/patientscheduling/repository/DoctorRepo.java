package com.learngn.springdatajpa.patientscheduling.repository;

import org.springframework.data.repository.CrudRepository;

import com.learngn.springdatajpa.patientscheduling.entity.Doctor;

public interface DoctorRepo extends CrudRepository<Doctor, Long> {

}
