package structural_facade;

// 外观（门面） Facade
public class Facade {
    private SubSystemA a = new SubSystemA();
    private SubSystemB b = new SubSystemB();
    private SubSystemC c = new SubSystemC();

    // 子系统A对外接口（调用子系统的业务而已）
    public void doA() {
        this.a.doA();
    }

    // 子系统B对外接口
    public void doB() {
        this.b.doB();
    }

    // 子系统C对外接口
    public void doC() {
        this.c.doC();
    }

}
