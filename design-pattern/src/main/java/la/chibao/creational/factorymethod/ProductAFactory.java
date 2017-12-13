package la.chibao.creational.factorymethod;

public class ProductAFactory implements Factory {

    public Product create() {
        return new ConcreteProductA();
    }

}
