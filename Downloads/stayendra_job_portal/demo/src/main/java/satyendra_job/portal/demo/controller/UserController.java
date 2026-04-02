package satyendra_job.portal.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import satyendra_job.portal.demo.model.JobPlan;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.OPTIONS})
@RestController
@RequestMapping("/api/jobplans")
public class UserController {

    private List<JobPlan> jobList = new ArrayList<>();

    // SAVE
    @PostMapping
    public JobPlan createJobPlan(@RequestBody JobPlan jobPlan) {
        jobList.add(jobPlan);
        return jobPlan;
    }

    // GET ALL
    @GetMapping
    public List<JobPlan> getAllJobPlans() {
        return jobList;
    }

    // DOWNLOAD
    @GetMapping("/download")
    public ResponseEntity<String> download() {
        return ResponseEntity.ok("Download working");
    }
}