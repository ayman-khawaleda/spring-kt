package com.example.demo.payroll

import org.springframework.web.bind.annotation.*

@RestController
class EmployeeController(private val repository: EmployeeRepository) {

    @GetMapping("/employees")
    fun getAllEmployees(): List<Employee> {
        return this.repository.findAll()
    }

    @GetMapping("/employees/{id}")
    fun getOneEmployee(@PathVariable id: Long): Employee {
        return this.repository.findById(id).orElseThrow {
            EmployeeNotFoundException(id)
        }
    }

    @PostMapping("/employees")
    fun newEmployee(@RequestBody newEmployee: Employee): Employee {
        return repository.save(newEmployee)
    }

    @PutMapping("/employees/{id}")
    fun replaceEmployee(@RequestBody employee: Employee, @PathVariable id: Long): Employee {
        return repository.findById(id).map {
            it.name = employee.name
            it.role = employee.role
            return@map repository.save(it)
        }.orElseGet {
            employee.id = id
            return@orElseGet repository.save(employee)
        }
    }

    @DeleteMapping("/employees/{id}")
    fun deleteEmployee(@PathVariable id: Long) {
        repository.deleteById(id)
    }
}