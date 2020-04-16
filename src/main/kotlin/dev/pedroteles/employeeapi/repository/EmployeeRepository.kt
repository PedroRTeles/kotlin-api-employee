package dev.pedroteles.employeeapi.repository

import dev.pedroteles.employeeapi.domain.Employee
import org.springframework.data.jpa.repository.JpaRepository

interface EmployeeRepository : JpaRepository<Employee, Long> {

}