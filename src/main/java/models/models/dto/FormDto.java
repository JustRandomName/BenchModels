package models.models.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FormDto {

    private UUID id;
    private String firstName;
    private String lastName;
    private String middleName;
    private LocalDate dateCreated;
    private String request;
    private String phone;
    private UserDto user;

    public FormDto(final UUID id,
                   final String firstName,
                   final String lastName,
                   final String middleName,
                   final LocalDate dateCreated,
                   final String request,
                   final String phone) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.dateCreated = dateCreated;
        this.request = request;
        this.phone = phone;
    }
}
