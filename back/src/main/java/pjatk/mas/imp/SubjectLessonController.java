package pjatk.mas.imp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pjatk.mas.imp.models.Subject;
import pjatk.mas.imp.models.SubjectLesson;

@RestController
@RequestMapping("/subjectLesson")
public class SubjectLessonController {
    SubjectLessonService subjectLessonService;

    public SubjectLessonController(SubjectLessonService subjectLessonService) {
        this.subjectLessonService = subjectLessonService;
    }

    @GetMapping("/all")
    public ResponseEntity<Iterable<SubjectLesson>> getAllSubjectsLesson(){

        return ResponseEntity.ok(subjectLessonService.getSubjectsLesson());
    }

    @PostMapping("add")
    public void addSubjectLesson(@RequestBody SubjectLesson subjectLesson){
        subjectLessonService.addSubjectLesson(subjectLesson);
    }

    @PostMapping("addAll")
    public void addAllSubjectLesson(@RequestBody Iterable<SubjectLesson> subjectLessons){
        subjectLessonService.addAllSubjectLesson(subjectLessons);
    }
}
