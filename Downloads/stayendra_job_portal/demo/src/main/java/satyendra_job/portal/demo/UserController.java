package satyendra_job.portal.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/jobplans")
public class UserController {

    private List<String> jobList = new ArrayList<>();

    @GetMapping
    public List<String> getAll() {
        return jobList;
    }

    @PostMapping
    public String add(@RequestBody String data) {
        jobList.add(data);
        return "Saved";
    }

    @GetMapping("/download")
    public ResponseEntity<String> download() {
        return ResponseEntity.ok("Download working");
    }
}