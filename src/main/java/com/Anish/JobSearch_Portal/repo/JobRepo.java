package com.Anish.JobSearch_Portal.repo;

import com.Anish.JobSearch_Portal.model.Job;
import org.springframework.data.repository.CrudRepository;

public interface JobRepo extends CrudRepository<Job,Long> {

}
