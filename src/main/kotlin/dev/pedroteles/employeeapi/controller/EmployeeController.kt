package dev.pedroteles.employeeapi.controller

import dev.pedroteles.employeeapi.domain.Employee
import dev.pedroteles.employeeapi.dao.EmployeeDao
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class EmployeeController {
    @Autowired
    private lateinit var employeeDao: EmployeeDao

    @GetMapping("/employee")
    fun getEmployee() : ResponseEntity<List<Employee>> {
        val employees = employeeDao.getEmployees()
        return ResponseEntity(employees, HttpStatus.OK)
    }

    @PostMapping("/employee")
    fun insertEmployee(@RequestBody employee: Employee) {
        employeeDao.insertEmployee(employee)
    }
}