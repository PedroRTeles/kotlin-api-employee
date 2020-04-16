package dev.pedroteles.employeeapi.impl

import dev.pedroteles.employeeapi.domain.Employee
import dev.pedroteles.employeeapi.repository.EmployeeRepository
import dev.pedroteles.employeeapi.dao.EmployeeDao
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class EmployeeDaoImpl : EmployeeDao {
    @Autowired
    private lateinit var repository: EmployeeRepository

    override fun getEmployees(): List<Employee> {
        return repository.findAll()
    }

    override fun insertEmployee(employee: Employee) {
        repository.save(employee)
    }
}