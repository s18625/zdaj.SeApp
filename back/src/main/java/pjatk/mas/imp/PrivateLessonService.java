package pjatk.mas.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pjatk.mas.imp.models.PrivateLesson;
import pjatk.mas.imp.models.Subject;

@Service
public class PrivateLessonService {
    @Autowired
    private final PrivateLessonDao privateLessonDao;

    public PrivateLessonService(PrivateLessonDao privateLessonDao) {
        this.privateLessonDao = privateLessonDao;
    }

    Iterable<PrivateLesson> getLessons(){
        return  privateLessonDao.findAll();
    }

    public void addLesson(PrivateLesson privateLesson){
        privateLessonDao.save(privateLesson);
    }
}
