package la.chibao.creational.factorymethod;

public class SimpleFactory {

    public static Product create(String name) {

        if ("A".equals(name)) {
            return new ConcreteProductA();
        }
        else
        if ("B".equals(name)){
            return new ConcreteProductB();
        }
        else {
            throw new RuntimeException("not support product " + name);
        }
    }

}
