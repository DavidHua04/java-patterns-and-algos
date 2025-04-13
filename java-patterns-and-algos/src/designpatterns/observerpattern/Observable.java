package designpatterns.observerpattern;

import java.util.HashSet;
import java.util.Set;

public class Observable {
    private Set<Observer> observers;

    // EFFECTS: list of observers is empty
    public Observable() {
        observers = new HashSet<>();
    }

    // MODIFIES: this
    // EFFECTS: adds observer to list of observers if not previously added
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // EFFECTS: notifies observers
    public void notifyObservers() {
        notifyObservers(null);
    }

    // EFFECTS: notifies observers
    public void notifyObservers(Object event) {
        for (Observer observer : observers) {
            observer.update(this, event);
        }
    }
}