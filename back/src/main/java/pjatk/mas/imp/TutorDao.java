package pjatk.mas.imp;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pjatk.mas.imp.models.Tutor;

@Repository
public interface TutorDao extends CrudRepository<Tutor,Long> {
    @Query("SELECT t FROM Tutor t INNER join t.listOfSubject ts  where ts.id = :subId")
    public Iterable<Tutor> getTutorsBySubject(@Param("subId") Long subId);
}
