package pjatk.mas.imp.models;

import javax.persistence.Entity;

@Entity
public class StationaryPrivateLesson extends PrivateLesson {
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
