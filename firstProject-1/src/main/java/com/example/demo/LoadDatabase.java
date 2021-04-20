package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(EmployeeRepository repository) {

    return args -> {
      log.info("Preloading  " + repository.save(new Employee("Akash", "Developer")));
      log.info("Preloading " + repository.save(new Employee("Ajay", "DBA")));
      log.info("Preloading " + repository.save(new Employee("Rahul", "Developer")));
      log.info("Preloading " + repository.save(new Employee("Atul", "GM")));
      log.info("Preloading " + repository.save(new Employee("Akshay", "Manager")));
      log.info("Preloading " + repository.save(new Employee("Rohit", "HR")));
      log.info("Preloading " + repository.save(new Employee("Radha", "Accountant")));
      log.info("Preloading " + repository.save(new Employee("Kishna", "UI Developer")));
    };
  }
}