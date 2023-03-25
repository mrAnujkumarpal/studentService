package in.student.service.studentService.service;

import in.student.service.studentService.domain.Student;

import java.util.List;

public interface IStudent {

    Student saveStudent(Student student);

    List<Student> allStudent();

    Student studentById(String studentId);

    Student updateStudent(Student student);
}

