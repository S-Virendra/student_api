package com.virendra.studentapi.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.virendra.studentapi.model.Student;
import com.virendra.studentapi.service.StudentService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    // 🟢 Get all students
    @GetMapping
    public List<Student> getAll() {
        return service.getAll();
    }

    // 🟡 Create student
    @PostMapping
    public Student create(@RequestBody Student s) {
        return service.save(s);
    }

    // 🟠 Update student
    @PutMapping("/{id}")
    public Student update(@PathVariable Long id, @RequestBody Student s) {
        return service.update(id, s);
    }

    // 🔴 Delete student
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "Deleted student with ID: " + id;
    }
}

