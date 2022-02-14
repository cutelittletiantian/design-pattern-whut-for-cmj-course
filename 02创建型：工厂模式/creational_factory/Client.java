package creational_factory;

public class Client {
    public static void main(String[] args) {
        // 开具体工厂1（用具体构造者1初始化构造者接口）
        ICreator creator1 = new ConcreteCreator1();
        // 生产一个具体产品1（用具体产品1初始化产品接口）
        IProduct product1 = creator1.factoryMethod();
        // 执行产品业务
        product1.doSomething();  /*这里会有一个输出*/

        // 开具体工厂2
        ICreator creator2 = new ConcreteCreator2();
        // 生产一个具体产品2+执行产品业务链式调用
        creator2.factoryMethod().doSomething();  /*这里会有一个输出*/

        // 其它同理，开工厂->造产品->用产品
    }
}
