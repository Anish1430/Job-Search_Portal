package com.Anish.JobSearch_Portal.service;

import com.Anish.JobSearch_Portal.model.Job;
import com.Anish.JobSearch_Portal.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

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

    public String getDeleteById(Long id) {
       jobRepo.deleteById(id);
       return "remove a Job";
    }

    public String updateJobsById(Long id, Double salary) {
        Job presentStock=jobRepo.findById(id).orElse(null);
        if(presentStock != null){
            presentStock.setJobSalary(salary);
             jobRepo.save(presentStock);
            return "Jobs is Updated";
        }else {
            return "Jobs is not updated";
        }
    }
}
