package com.example.db.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="tbl_student",
        uniqueConstraints = @UniqueConstraint(
            name = "email_unique",
            columnNames = "email_address"
        )
)
public class Student {
  
    @Id
    @SequenceGenerator(
        name="student_incr",
        sequenceName = "student_incr",
        allocationSize = 1

    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "student_incr"
    )

    private long studentId;
    private String firstName;
    private String lastName;
    private String emailId;

    @Column(
        name ="email_address",
        nullable = false
    )
    private String gurdianName;
    private String gurdianEmail;
    private String gurdaianNumber;    
}
