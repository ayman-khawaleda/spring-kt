package com.example.demo.payroll

import java.lang.RuntimeException;

class EmployeeNotFoundException(id: Long) : RuntimeException("Could Not Find Employee With Id: %s".format(id))
