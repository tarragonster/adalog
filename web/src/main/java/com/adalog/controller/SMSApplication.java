package com.adalog.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = { "com.adalog.*" })
@EntityScan(basePackages = { "com.adalog.*" })
@EnableJpaRepositories(basePackages = { "com.adalog.*" })
public class SMSApplication {

  public static void main(String[] args) {
    SpringApplication.run(SMSApplication.class);
  }
}
