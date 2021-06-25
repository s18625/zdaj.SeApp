package pjatk.mas.imp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pjatk.mas.imp.models.Subject;
import pjatk.mas.imp.models.Tutor;

@RestController
@CrossOrigin
@RequestMapping("/subject")
public class SubjectController {
    SubjectService _subService;
    public SubjectController(SubjectService subjectService) {
        _subService = subjectService;
    }

    @GetMapping("/all")
    public ResponseEntity<Iterable<Subject>> getAllSubjects(){

        return ResponseEntity.ok(_subService.getSubjects());
    }

    @PostMapping("add")
    public void addSubject(@RequestBody Subject subject){
        _subService.addSubject(subject);
    }
}
