package com.task.restapi.taskonrestapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaskonrestapiApplication implements CommandLineRunner {
    @Autowired
    TaskService ta;
 Logger logger = LoggerFactory.getLogger(getClass());
    public static void main(String[] args) {
        SpringApplication.run(TaskonrestapiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("all task details are"+ta.getalltaskdetails());
        ta.addnewtask(new Taskdetails("org.springframework.boot","spring-boot-devtools",1.85));
        logger.info("new task details after post "+ta.getalltaskdetails());


    }
}
