package pjatk.mas.imp.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class SubjectLesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String materialScope;


    @ManyToOne
    @JoinColumn(name="subject_id", nullable=true)
    private Subject subject;

    @ManyToOne
    @JoinColumn(name="privateLesson_id", nullable=true)
    private PrivateLesson privateLesson;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMaterialScope() {
        return materialScope;
    }

    public void setMaterialScope(String materialScope) {
        this.materialScope = materialScope;
    }


    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public PrivateLesson getPrivateLesson() {
        return privateLesson;
    }

    public void setPrivateLesson(PrivateLesson privateLesson) {
        this.privateLesson = privateLesson;

    }


}
