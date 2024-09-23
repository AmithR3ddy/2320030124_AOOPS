package EventHandle;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class EventHandlingSystem {

    private List<EventListener> listeners = new ArrayList<>();

    
    public class Event {
        private String eventType;

        public Event(String eventType) {
            this.eventType = eventType;
        }

        public String getEventType() {
            return eventType;
        }
    }

    
    public class EventListener {
        private String eventType;
        private Consumer<Event> eventHandler;

        public EventListener(String eventType, Consumer<Event> eventHandler) {
            this.eventType = eventType;
            this.eventHandler = eventHandler;
        }

        public String getEventType() {
            return eventType;
        }

        public Consumer<Event> getEventHandler() {
            return eventHandler;
        }
    }

    public void registerEventListener(String eventType, Consumer<Event> eventHandler) {
        listeners.add(new EventListener(eventType, eventHandler));
    }

    public void triggerEvent(String eventType) {
        Event event = new Event(eventType);
        for (EventListener listener : listeners) {
            if (listener.getEventType().equals(eventType)) {
                listener.getEventHandler().accept(event);
            }
        }
    }

    public static void main(String[] args) {
        EventHandlingSystem system = new EventHandlingSystem();

        
        system.registerEventListener("Login", event -> System.out.println("Handling login event: " + event.getEventType()));
        system.registerEventListener("Logout", event -> System.out.println("Handling logout event: " + event.getEventType()));
        system.registerEventListener("SignUp", event -> System.out.println("Handling sign-up event: " + event.getEventType()));

        
        system.triggerEvent("Login");
        system.triggerEvent("Logout");
        system.triggerEvent("SignUp");
        system.triggerEvent("Login");
    }
}

