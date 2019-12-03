package com.task.restapi.taskonrestapi;

import org.springframework.stereotype.Service;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TaskService {
    private List<Taskdetails> T = new ArrayList<>(Arrays.asList(new Taskdetails("org.springframework.boot","spring-boot-maven-plugin", 1.86 ),
            new Taskdetails("org.projectlombok","lombok", 1.83),
            new Taskdetails("org.springframework.boot","spring-boot-starter-test", 1.81),
            new Taskdetails("org.junit.vintage","junit-vintage-engine", 1.82)));

public List<Taskdetails> getalltaskdetails(){
    return T;
}

    public void addnewtask(Taskdetails taskdetails) {
    T.add(taskdetails);
    }
}