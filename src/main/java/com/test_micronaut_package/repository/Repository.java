package com.test_micronaut_package.repository;

import com.test_micronaut_package.entity.Student;

import io.micronaut.data.jpa.repository.JpaRepository;

@io.micronaut.data.annotation.Repository
public interface Repository extends JpaRepository<Student,Integer>{

}
