package structural_facade;

public class Client {
    // 客户
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.doA();  // 调用子系统A
        facade.doB();  // 调用子系统B
        facade.doC();  // 调用子系统C
    }
}
