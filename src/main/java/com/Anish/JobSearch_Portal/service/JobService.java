package com.Anish.JobSearch_Portal.service;

import com.Anish.JobSearch_Portal.model.Job;
import com.Anish.JobSearch_Portal.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    JobRepo jobRepo;

    public String addJobs(List<Job> newJob) {
      jobRepo.saveAll(newJob);
      return "Added a NewJob";
    }

    public List<Job> getAllJobs() {
     return (List<Job>) jobRepo.findAll();
    }
}
