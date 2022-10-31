package com.technoelevate.copy.prop.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.technoelevate.copy.prop.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}