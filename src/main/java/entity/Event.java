package entity;

import java.util.Date;
import java.util.List;

/**
 * Created by kowalskiy on 15.03.17.
 */
public class Event {
    private String name;

    private Area area;

    private Date date;

    private List<Band> participants;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Area getArea() { return area; }

    public void setArea(Area area) { this.area = area; }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Band> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Band> participants) {
        this.participants = participants;
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", address=" + area +
                ", date=" + date +
                ", participants=" + participants +
                '}';
    }
}
