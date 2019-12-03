package com.task.restapi.taskonrestapi;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//providing maven details
@ToString @Getter @Setter
public class Taskdetails {
    @NotNull(message = "groupid cannot be null")
    private String groupid;
    @NotNull(message = "artifactid cannot be null")
    private String artifactid;
    @NotNull(message = "version details is must ")

    private double version;

    public Taskdetails() {
    }

    public Taskdetails( String groupid, String artifactid, double version) {
        this.groupid = groupid;
        this.artifactid = artifactid;
        this.version = version;
    }
}
