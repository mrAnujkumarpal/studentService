package in.student.service.studentService.service;

import in.student.service.studentService.domain.Student;
import in.student.service.studentService.exception.ResourceNotFoundException;
import in.student.service.studentService.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class StudentServiceImpl implements IStudent {

    @Autowired
    private StudentRepository repository;

    @Override
    public Student saveStudent(Student student) {

        student.setStudentId(UUID.randomUUID().toString());
        return repository.save(student);
    }

    @Override
    public List<Student> allStudent() {
        return this.repository.findAll();
    }

    @Override
    public Student studentById(String studentId) {
        return this.repository.findById(studentId).orElseThrow(() -> new ResourceNotFoundException("This student is not present " + studentId));
    }

    @Override
    public Student updateStudent(Student student) {
        Student savedStudent = studentById(student.getStudentId());
        savedStudent.setStudentName(savedStudent.getStudentName());
        savedStudent.setEmail(student.getEmail());
        savedStudent.setMobileNo(student.getMobileNo());
        return this.repository.save(savedStudent);
    }
}
