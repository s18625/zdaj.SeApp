package pjatk.mas.imp;

import org.springframework.data.repository.CrudRepository;
import pjatk.mas.imp.models.PrivateLesson;
import pjatk.mas.imp.models.Subject;

public interface PrivateLessonDao extends CrudRepository<PrivateLesson,Long> {
}
