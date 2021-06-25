package pjatk.mas.imp.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Subject {
    public Subject() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String acronym;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAcronym() {
        return acronym;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    @ManyToMany()
    private List<Tutor> listOfTutors = new ArrayList();

    @OneToMany()
    private List<SubjectLesson> subjectLessons;


    public List<Tutor> getListOfTutors() {
        return listOfTutors;
    }

    public void setListOfTutors(List<Tutor> listOfTutors) {
        this.listOfTutors = listOfTutors;
    }

    public List<SubjectLesson> getSubjectLessons() {
        return subjectLessons;
    }

    public void setSubjectLessons(List<SubjectLesson> subjectLessons) {
        this.subjectLessons = subjectLessons;
    }



}
