package in.student.service.studentService.controllers;

import in.student.service.studentService.domain.Student;
import in.student.service.studentService.service.IStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student/")
public class StudentController {

    @Autowired
    IStudent studentService;

    @GetMapping("all")
    ResponseEntity<List<Student>> getAllStudents() {
        return ResponseEntity.ok(this.studentService.allStudent());
    }

    @PostMapping("new")
    ResponseEntity<Student> newStudent(@RequestBody Student student) {
        Student newStudent = this.studentService.saveStudent(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(newStudent);
    }

    @GetMapping("{studentId}/view")
    ResponseEntity<Student> getStudent(@PathVariable String studentId) {
        Student student = this.studentService.studentById(studentId);
        return ResponseEntity.ok(student);
    }

}
