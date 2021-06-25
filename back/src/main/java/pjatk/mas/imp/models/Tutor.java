package pjatk.mas.imp.models;

import org.hibernate.annotations.CascadeType;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Tutor")
public class Tutor extends Person {
    public Tutor() {
    }

    @Nullable
    private Integer yearOfGraduationPJATK;
    private double hourPayment;
    private Integer grade;
    private static final double maximalHourPayment =200.0;

    @Nullable
    public Integer getYearOfGraduationPJATK() {
        return yearOfGraduationPJATK;
    }

    public double getHourPayment() {
        return hourPayment;
    }

    public void setYearOfGraduationPJATK(@Nullable Integer yearOfGraduationPJATK) {
        this.yearOfGraduationPJATK = yearOfGraduationPJATK;
    }

    public void setHourPayment(double hourPayment) {
        this.hourPayment = hourPayment;
    }

    @ManyToMany
    @JoinTable(
            name = "Tutor_Subject",
            joinColumns = { @JoinColumn(name = "tutor_id") },
            inverseJoinColumns = { @JoinColumn(name = "subject_id") }
    )
    private List<Subject> listOfSubject = new ArrayList();

    @OneToMany()
    private List<PrivateLesson> lessonList;

    @OneToMany()
    private List<Advertisement> advertisements;

    public List<Subject> getListOfSubject() {
        return listOfSubject;
    }

    public void setListOfSubject(List<Subject> listOfSubject) {
        this.listOfSubject = listOfSubject;
    }

    public List<PrivateLesson> getLessonList() {
        return lessonList;
    }

    public void setLessonList(List<PrivateLesson> lessonList) {
        this.lessonList = lessonList;
    }

    public List<Advertisement> getAdvertisements() {
        return advertisements;
    }

    public void setAdvertisements(List<Advertisement> advertisements) {
        this.advertisements = advertisements;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

}
