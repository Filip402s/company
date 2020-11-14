package com.example.Company;

import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class Employee {

    private int Id;
    private String login;
    private String password;
    private String firstName;
    private String lastName;
    private LocalDate creationDate;


    public Employee() {

    }

    public Employee(int id, String login, String password, String firstName, String lastName, LocalDate creationDate) {

        Id = id;
        this.login = login;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.creationDate = creationDate;
    }


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }



    public String toString() {

        return "Employee [id=" + Id +
                ", login =" + login +
                ", password =" + password +
                ", firstName =" + firstName +
                ", lastName =" + lastName +
                ", creationDate =" + creationDate;


    }
}


