package pjatk.mas.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pjatk.mas.imp.models.Subject;
import pjatk.mas.imp.models.SubjectLesson;

@Service
public class SubjectLessonService {

    @Autowired
    private final SubjectLessonDao _subjectLessonDao;

    public SubjectLessonService(SubjectLessonDao subjectLessonDao) {
        this._subjectLessonDao = subjectLessonDao;
    }

    Iterable<SubjectLesson> getSubjectsLesson(){
        return _subjectLessonDao.findAll();
    }

    public void addSubjectLesson(SubjectLesson subjectLesson){
        _subjectLessonDao.save(subjectLesson);
    }

    public void addAllSubjectLesson(Iterable<SubjectLesson> subjectLessons){
        _subjectLessonDao.saveAll(subjectLessons);
    }
}
