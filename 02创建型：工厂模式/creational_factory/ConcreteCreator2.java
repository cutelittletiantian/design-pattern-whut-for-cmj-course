package creational_factory;

// 具体构造者2
public class ConcreteCreator2 implements ICreator {

    // 工厂造具体产品2的方法
    public IProduct factoryMethod() {
        return new ConcreteProduct2();
    }
}
