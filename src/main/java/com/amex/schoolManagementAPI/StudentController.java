package com.amex.schoolManagementAPI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    private static final Logger logger = LoggerFactory.getLogger(StudentController.class);

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        logger.debug("Received student: {}", student);
        return studentService.addStudent(student);
    }

    @GetMapping("/{id}")
    public List<Student> getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    @GetMapping("/name/{name}")
    public List<Student> getStudentsByName(@PathVariable String name) {
        return studentService.getStudentsByName(name);
    }

    @GetMapping("/class/{className}")
    public List<Student> getStudentsByClass(@PathVariable String className) {
        return studentService.getStudentsByClass(className);
    }

    @PutMapping
    public Student updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }
}