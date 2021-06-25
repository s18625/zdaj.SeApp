package pjatk.mas.imp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pjatk.mas.imp.models.Tutor;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/tutor")
public class TutorController {

    private final TutorService tutorService;

    public TutorController(TutorService tutorService) {
        this.tutorService = tutorService;
    }


    @GetMapping("/all")
    public ResponseEntity<Iterable<Tutor>> getAllTuttors(){
        Iterable<Tutor> tutors = tutorService.getTutors();
        return ResponseEntity.ok(tutors);
    }

    @PostMapping("/add")
    public void addTutor(@RequestBody Tutor tutor){
        tutorService.addTutor(tutor);
    }

    @GetMapping("/allBySub/{id}")
    public ResponseEntity<Iterable<Tutor>> getAllTutorsBySub(@PathVariable Long id){
        Iterable<Tutor> tutors = tutorService.getTutorsBySuId(id);
        return ResponseEntity.ok(tutors);
    }

    @GetMapping("/getOne/{id}")
    public ResponseEntity<Tutor> getTutor(@PathVariable Long id){
        Tutor tutor = tutorService.getTutor(id);
        return ResponseEntity.ok(tutor);
    }


}


