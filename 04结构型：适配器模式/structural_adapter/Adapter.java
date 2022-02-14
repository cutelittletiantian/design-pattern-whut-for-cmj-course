package structural_adapter;

// 适配器
public class Adapter implements ITarget {

    // 关联被适配者的接口
    private IAdaptee adaptee;

    public Adapter(IAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void methodA() {
        // 适配，即：实现methodA时，实际在其内支持被适配者的methodB
        adaptee.methodB();
        // 真实情况下，除了调用函数本身，也会有兼容相关的业务代码
    }
}
