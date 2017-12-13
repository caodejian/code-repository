package la.chibao.creational.factorymethod;

public class ProductBFactory implements Factory {

    public Product create() {
        return new ConcreteProductB();
    }

}
