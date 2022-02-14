package creational_factory;

//具体构造者1
public class ConcreteCreator1 implements ICreator {

    // 工厂造具体产品1的方法
    public IProduct factoryMethod() {
        return new ConcreteProduct1();
    }
}
