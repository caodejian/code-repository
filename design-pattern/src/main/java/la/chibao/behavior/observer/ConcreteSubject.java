package la.chibao.behavior.observer;

import java.util.*;

public class ConcreteSubject implements Subject {

    List<Observer> observers = new LinkedList<Observer>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
