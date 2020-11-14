package com.example.Company;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/employees")
public class EmployeeRepository {

    public List<Employee>employees;

    public EmployeeRepository(){
        employees = new ArrayList<>();
        employees.add(new Employee(1, "Filip", "FilipPraca", "Filip", "Sałapat", LocalDate.of(2019, 11, 01)));
        employees.add(new Employee(2, "Kamil", "KamilPraca", "Kamil", "Nowak", LocalDate.of(2019, 11, 01)));

    }

    // READ ALL
    @GetMapping("/all")
    public List<Employee> getAll(){
        return employees;
    }

    // CREATE
    @PostMapping
    public boolean addEmployee(@RequestBody Employee employee){
        return employees.add(employee);
    }

    // READ by id
    @GetMapping
    public Employee getById(@RequestParam int index){
        Optional<Employee> first = employees.stream().filter
                (element -> element.getId() == index).findFirst();
        return first.get();

    }

    // UPDATE
    @PutMapping
    public boolean updateEmployee(@RequestBody Employee employee) {
        return employees.add(employee);

    }

    // DELETE
    @DeleteMapping
    public boolean deleteEmployee(@RequestParam int index){
        return employees.removeIf(element -> element.getId() == index);

    }
}
