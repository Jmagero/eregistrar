package eregistrarmgt.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long studentId;

    @Basic(optional = false)
    private String studentNumber;

    @Basic(optional = false)
    private String firstName;
    @Basic
    private String middleName;
    @Basic(optional = false)
    private String lastName;

    private double cgpa;

    @Temporal(TemporalType.DATE)
    private LocalDate dateOfEnrollment;

    private boolean isInternational;
}
