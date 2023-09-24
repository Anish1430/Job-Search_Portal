package com.Anish.JobSearch_Portal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Job {

    @Id
    private Long employeeId;
    private String jobTitle;
    private String jobDescription;
    private String jobLocation;

    //Question is Asking the Salary is Above 20 thousands....
    @Min(value = 20000, message = "Salary should be above 20,000")
    private Double jobSalary;

    private String companyEmail;

    private String companyName;
    private String employerName;


    //For String Type and if Value is Integer type then you can use byDefault Ordinal...
    @Enumerated(EnumType.STRING)
    private Type jobType;
}
