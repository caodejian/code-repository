package la.chibao.behavior.observer;

public interface Subject {

    void attach(Observer observer);

    void detach(Observer observer);

    void notifyObservers();

}