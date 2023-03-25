package in.student.service.studentService.domain;

import in.student.service.studentService.payload.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "STUDENT")
public class Student implements Serializable {
    @Id
    private String studentId;
    private String studentName;
    private String mobileNo;
    private String email;

    @Transient
    List<Address> addressList;
}
