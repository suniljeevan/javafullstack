package com.pu.sims.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pu.sims.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long>{

}
