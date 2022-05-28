package com.example.demo.payroll

import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Entity

@Entity
data class Employee(@Id @GeneratedValue var id:Long, var name:String, var role:String)
