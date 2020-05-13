package com.dasun.rentacar.demoapplication.service;

import com.dasun.rentacar.demoapplication.model.Student;

public interface StudentService {

    Student save(Student student);

    Student findStudentById(int id);

}
