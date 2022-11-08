package com.developer.employeemanagement.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "employee")
public class EmployeeEntity {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name="increment", strategy ="increment")
    @Column(name = "emp_id")
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="gender")
    private String gender;
    @Column(name="date_of_birth")
    private Date dateOfBirth;
    @Column(name="adress")
    private String adress;


    public EmployeeEntity() {
    }

    public EmployeeEntity(Long id, String name, String gender, Date dateOfBirth, String adress) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.adress = adress;
    }
    //getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
