package designpatterns.observerpattern;

public interface Observer {
    // EFFECTS: updates this observer
    void update(Observable observable, Object event);
}