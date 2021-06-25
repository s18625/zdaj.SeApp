package pjatk.mas.imp.models;

import org.springframework.lang.Nullable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "Publication")
public class Publication extends Post{
    @Nullable
    private LocalDate  expiryDate;
    @Nullable
    private String Expectations;

    @ManyToOne
    @JoinColumn(name="student_id", nullable=false)
    private Student student;

    @Nullable
    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(@Nullable LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Nullable
    public String getExpectations() {
        return Expectations;
    }

    public void setExpectations(@Nullable String expectations) {
        Expectations = expectations;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
