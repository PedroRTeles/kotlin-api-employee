package dev.pedroteles.employeeapi.dao

import dev.pedroteles.employeeapi.domain.Employee

interface EmployeeDao {
    fun getEmployees() : List<Employee>
    fun insertEmployee(employee: Employee)
}