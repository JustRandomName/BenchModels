package model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class UserDto {

    private String id;
    private String firstName;
    private String lastName;
    private String middleName;
    private LocalDate DOB;
    private String password;
    private String username;
    private boolean enabled;
}
