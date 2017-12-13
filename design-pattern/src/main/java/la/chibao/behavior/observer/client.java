package la.chibao.behavior.observer;

public class client {

    public static void main(String[] args) {

        Subject subject = new ConcreteSubject();

        subject.attach(new ConcreteObserverA());

        subject.attach(new ConcreteObserverB());

        subject.notify();

    }

}
