package com.project.employeemanagement.controller;

import com.project.employeemanagement.model.Employee;
import com.project.employeemanagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
@CrossOrigin(value = "*")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("/employee")
    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }

    @PutMapping("/employee")
    public String updateEmp(@RequestBody Employee employee){
        employeeRepository.save(employee);
        return "updated ";
    }

    @DeleteMapping("/employee")
    public String deleteEmp(@Param("id") long id){
        employeeRepository.deleteById(id);
        return "Deleted successfully";
    }
}
