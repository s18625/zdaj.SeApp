package pjatk.mas.imp.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Advertisement")
public class Advertisement extends Post {
    private String ContactEmail;

    @ManyToOne
    @JoinColumn(name="tutor_id", nullable=false)
    private Tutor tutor;

    public String getContactEmail() {
        return ContactEmail;
    }

    public void setContactEmail(String contactEmail) {
        ContactEmail = contactEmail;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }
}
