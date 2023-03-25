package in.student.service.studentService.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private String addressId;
    private String address;
    private String city;
    private String state;
    private Integer pin;
}
