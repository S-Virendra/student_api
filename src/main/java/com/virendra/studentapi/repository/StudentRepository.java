package com.virendra.studentapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.virendra.studentapi.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
