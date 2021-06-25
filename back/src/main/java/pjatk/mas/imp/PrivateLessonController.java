package pjatk.mas.imp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pjatk.mas.imp.models.PrivateLesson;
import pjatk.mas.imp.models.Subject;

@RestController
@RequestMapping("/lesson")
public class PrivateLessonController {

    PrivateLessonService privateLessonService;
    public PrivateLessonController(PrivateLessonService privateLessonService) {
        this.privateLessonService = privateLessonService;
    }

    @GetMapping("/all")
    public ResponseEntity<Iterable<PrivateLesson>> getAllLessons(){
        return ResponseEntity.ok(privateLessonService.getLessons());
    }

    @PostMapping("/add")
    public void addSubject(@RequestBody PrivateLesson privateLesson){
        privateLessonService.addLesson(privateLesson);
    }
}
