package com.example.demo.payroll
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {
    private final val log:Logger = LoggerFactory.getLogger("LoadDatabase")

    @Bean
    fun initDatabase(repo: EmployeeRepository):CommandLineRunner {
        return CommandLineRunner{
            log.info("Preloading "+repo.save(Employee(name = "Pablo", role = "King", id = 0)))
            log.info("Preloading "+repo.save(Employee(name = "Sara", role = "Queen", id = 0)))
        }
    }


}