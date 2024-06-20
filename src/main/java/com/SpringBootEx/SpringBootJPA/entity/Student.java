package com.SpringBootEx.SpringBootJPA.entity;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Table(
        name="tbl_student",
         uniqueConstraints   = @UniqueConstraint(
        name = "emailid_unique",
        columnNames = "email_address"
)
)
public class Student {
    @Id
    @SequenceGenerator(
            name = "Student_sequence",
            sequenceName = "Student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "Student_sequence"
    )
    private Long studentId;
    private String firstName;
    private String lastName;
    //every time we should get email id, as it is made not null
    @Column(
            nullable = false
    )
    private String emailId;
    private String guardianName;
    private String guardianEmail;
    private String guardianMobile;
}
