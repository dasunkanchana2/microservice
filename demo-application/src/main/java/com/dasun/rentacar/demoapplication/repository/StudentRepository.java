package com.dasun.rentacar.demoapplication.repository;

import com.dasun.rentacar.demoapplication.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
