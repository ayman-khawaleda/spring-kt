package com.example.demo.payroll

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@ControllerAdvice
class EmployeeNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler
    @ResponseStatus(HttpStatus.NOT_FOUND)
    fun employeeNotFound(exception: EmployeeNotFoundException):String{
        return exception.message.toString()
    }

}