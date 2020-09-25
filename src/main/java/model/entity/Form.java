package model.entity;

import static javax.persistence.CascadeType.MERGE;
import static javax.persistence.FetchType.EAGER;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.springframework.data.annotation.CreatedDate;

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
    private String name;

    @Column
    @CreatedDate
    private LocalDate dateCreated;

    @Column
    private String request;

    @Column
    private String phone;

    @ManyToOne(fetch = EAGER, cascade = MERGE)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public Form(final UUID id,
                final String request,
                final String phone,
                final String name,
                final User userId) {
        this.id = id;
        this.request = request;
        this.phone = phone;
        this.user = userId;
        this.name = name;
    }
}
