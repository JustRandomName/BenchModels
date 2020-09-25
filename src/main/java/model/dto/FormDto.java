package model.dto;


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
    private LocalDate dateCreated;
    private String request;
    private String phone;
    private String userId;
    private String name;

    public FormDto(final UUID id,
                   final LocalDate dateCreated,
                   final String request,
                   final String name,
                   final String phone) {
        this.id = id;
        this.dateCreated = dateCreated;
        this.request = request;
        this.phone = phone;
        this.name = name;
    }
}
