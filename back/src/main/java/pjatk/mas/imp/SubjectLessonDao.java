package pjatk.mas.imp;

import org.springframework.data.repository.CrudRepository;
import pjatk.mas.imp.models.Subject;
import pjatk.mas.imp.models.SubjectLesson;

public interface SubjectLessonDao extends CrudRepository<SubjectLesson,Long> {
}
