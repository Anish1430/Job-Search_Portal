package com.Anish.JobSearch_Portal.controller;


import com.Anish.JobSearch_Portal.model.Job;
import com.Anish.JobSearch_Portal.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {

    @Autowired
    JobService jobService;

//    //Get the Job

    @GetMapping("jobs")
    public List<Job> getAllJobs(){
        return jobService.getAllJobs();
    }

    //Post the Job
    @PostMapping("jobs")
    public String addJobs(@RequestBody List<Job> newJob){
        return jobService.addJobs(newJob);
    }
  //Delete the Jobs
  @DeleteMapping("jobs/id/{id}")
  public String getDeleteById(@PathVariable Long id){
      return jobService.getDeleteById(id);
  }

}
