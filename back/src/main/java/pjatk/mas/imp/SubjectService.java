package pjatk.mas.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pjatk.mas.imp.models.Subject;

@Service
public class SubjectService {

    @Autowired
    private final SubjectDao subjectDao;

    public SubjectService(SubjectDao subjectDao) {
        this.subjectDao = subjectDao;
    }

    Iterable<Subject> getSubjects(){
        return  subjectDao.findAll();
    }

    public void addSubject(Subject subject){
        subjectDao.save(subject);
    }
}
