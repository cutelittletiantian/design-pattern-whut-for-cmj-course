package structural_decorator;

public class ConcreteDecorator2 extends AbDecorator{
    public ConcreteDecorator2(AbComponent component) {
        super(component);
    }

    protected void decorator() {
        System.out.println("叠装饰2功能的buff");
    }

    public void componentOperation(){
        super.componentOperation();
        decorator();
    }
}

