package com.learngn.springdatajpa.files.repository;

import org.springframework.data.repository.CrudRepository;

import com.learngn.springdatajpa.files.entity.Image;

public interface ImageRepo extends CrudRepository<Image, Long> {

}
