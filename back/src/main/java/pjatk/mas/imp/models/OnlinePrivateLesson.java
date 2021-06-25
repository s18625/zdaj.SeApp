package pjatk.mas.imp.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class OnlinePrivateLesson extends PrivateLesson {

    private Platform platformName;

    public Platform getPlatformName() {
        return platformName;
    }

    public void setPlatformName(Platform platformName) {
        this.platformName = platformName;
    }
}
