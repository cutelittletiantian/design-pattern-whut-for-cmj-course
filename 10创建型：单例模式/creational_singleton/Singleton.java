package creational_singleton;

public class Singleton {
    // 静态块，使用公共内存区域
    private static Singleton uniqueInstance = null;

    // 构造方法私有化，对外不能用new创建
    private Singleton() {

    }

    // 静态方法，直接由类调用
    // 互斥，确保多线程调用时不出问题（线程安全）
    public synchronized static Singleton getInstance() {
        // 为空的时候才创建
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    // 其它有关的业务函数（可以不是静态）
    public void doSomething() {
        System.out.println("一个太阳，铁打的一个，单例出现");
    }
}
