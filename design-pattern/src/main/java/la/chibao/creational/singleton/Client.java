package la.chibao.creational.singleton;

import org.junit.Test;

public class Client {

    @Test
    public void singletonHungryTest() {
        SingletonHungry singletonHungry = SingletonHungry.getInstance();

        // ......

    }

    @Test
    public void singletonLazyTest() {

        SingletonLazy singletonLazy = SingletonLazy.getInstance();
        // ......

        SingletonLazy singletonLazy2 = SingletonLazy.getInstance2();
        // ......

    }

}

