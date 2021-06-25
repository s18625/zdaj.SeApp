package pjatk.mas.imp;

import org.springframework.stereotype.Service;
import pjatk.mas.imp.models.Tutor;

import java.util.Optional;

@Service
public class TutorService {
    private final TutorDao tutorDao;

    public TutorService(TutorDao tutorDao) {
        this.tutorDao = tutorDao;
    }

    public Iterable<Tutor> getTutors(){
        return tutorDao.findAll();
    }

    public void addTutor(Tutor tutor){
        tutorDao.save(tutor);

    }
    public Iterable<Tutor> getTutorsBySuId(Long subId){
        return tutorDao.getTutorsBySubject(subId);
    }
    public Tutor getTutor(Long subId){
        Optional<Tutor> v =   tutorDao.findById(subId);
        return v.get();
    }
}
