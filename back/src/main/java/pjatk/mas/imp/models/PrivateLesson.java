package pjatk.mas.imp.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "PrivateLesson")
@Inheritance(strategy = InheritanceType.JOINED)
public  class PrivateLesson {
    public PrivateLesson() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date;
    private Long minutesOfLesson;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @JsonIgnore
    public Long getMinutesOfLesson() {
        return minutesOfLesson;
    }

    public void setMinutesOfLesson(Long minutesOfLesson) {
        this.minutesOfLesson = minutesOfLesson;
    }



    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="student_id", nullable = true)
    private Student student;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="tutor_id", nullable=true)
    private Tutor tutor;

    public Student getStudent() {
        return student;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }
}
