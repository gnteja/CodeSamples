package com.learngn.springdatajpa.patientscheduling.repository;

import org.springframework.data.repository.CrudRepository;

import com.learngn.springdatajpa.patientscheduling.entity.Appointment;

public interface AppointmentRepo extends CrudRepository<Appointment, Long> {

}
