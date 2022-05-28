package com.example.demo.payroll

import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Entity

@Entity
data class Employee(@Id @GeneratedValue val id:Long,val name:String,val role:String)
