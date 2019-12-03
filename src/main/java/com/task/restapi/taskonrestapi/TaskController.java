package com.task.restapi.taskonrestapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController

public class TaskController {
    @Autowired
    TaskService task;

    @GetMapping(path = "/taskdetails")
    public List<Taskdetails> getTaskdetails(){
        return task.getalltaskdetails();
    }

    // we use @Valid to access  validation on bean utility i,e. Taskdetails
//    @RequestMapping(method = RequestMethod.POST,value = "/employees")
    @PostMapping( "/taskdetails")
    public void addnewtask( @Valid @RequestBody Taskdetails taskdetails){
        task.addnewtask(taskdetails);

    }
}
