package satyendra_job.portal.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/jobplans")
public class UserController {

    @GetMapping
    public List<String> getAll() {
        return new ArrayList<>();
    }

    @GetMapping("/download")
    public ResponseEntity<String> download() {
        return ResponseEntity.ok("Download working");
    }
}
