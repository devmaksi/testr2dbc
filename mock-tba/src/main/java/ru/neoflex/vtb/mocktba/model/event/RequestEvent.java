package ru.neoflex.vtb.mocktba.model.event;

public class RequestEvent {

    private Event event;

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    @Override
    public String toString() {
        return "RequestEvent{" +
                "event=" + event +
                '}';
    }
}
