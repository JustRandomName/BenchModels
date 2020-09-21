package model.entity;

import static javax.persistence.CascadeType.MERGE;
import static javax.persistence.FetchType.EAGER;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Form {

    @Id
    @Type(type = "uuid-char")
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(columnDefinition = "char(36)")
    private UUID id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String middleName;

    @Column
    private LocalDate dateCreated;

    @Column
    private String request;

    @Column
    private String phone;

    @ManyToOne(fetch = EAGER, cascade = MERGE)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public Form(final UUID id,
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
