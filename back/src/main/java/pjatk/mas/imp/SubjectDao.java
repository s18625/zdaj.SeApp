package pjatk.mas.imp;

import org.springframework.data.repository.CrudRepository;
import pjatk.mas.imp.models.Subject;

public interface SubjectDao  extends CrudRepository<Subject,Long> {
}
