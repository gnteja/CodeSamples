package com.learngn.springdatajpa.map.repository;

import org.springframework.data.repository.CrudRepository;

import com.learngn.springdatajpa.map.entity.ProjectMap;

public interface ProjectMapRepo extends CrudRepository<ProjectMap, Long> {

}
