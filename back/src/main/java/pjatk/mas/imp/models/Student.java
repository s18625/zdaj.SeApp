package pjatk.mas.imp.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Student")
public class Student extends Person{

    public Student() {
    }

    @Column(unique = true)
    private String eska;

    @OneToMany()
    private List<PrivateLesson> lessonList;

    @OneToMany()
    private List<Publication> publications;

    public String getEska() {
        return eska;
    }

    public void setEska(String eska) {
        this.eska = eska;
    }

    public List<PrivateLesson> getLessonList() {
        return lessonList;
    }

    public void setLessonList(List<PrivateLesson> lessonList) {
        this.lessonList = lessonList;
    }

    public List<Publication> getPublications() {
        return publications;
    }

    public void setPublications(List<Publication> publications) {
        this.publications = publications;
    }
}
