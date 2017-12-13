package la.chibao.creational.singleton;

public class SingletonLazy {

    private static SingletonLazy instance;

    private SingletonLazy() {}

    public static synchronized SingletonLazy getInstance() {

        if (instance == null) {
            instance = new SingletonLazy();
        }

        return instance;
    }

    private static Object lock;
    public static SingletonLazy getInstance2() {

        if (instance == null) {
            synchronized (lock) {
                //第一次判断跟synchronized执行有时间差，故不是原子操作，需要再次校验
                if (instance == null) {
                    instance = new SingletonLazy();
                }
            }
        }

        return instance;
    }

}
