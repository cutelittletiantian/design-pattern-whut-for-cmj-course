package structural_decorator;

public class ConcreteDecorator1 extends AbDecorator{
    public ConcreteDecorator1(AbComponent component) {
        super(component);
    }

    protected void decorator() {
        System.out.println("叠装饰1功能的buff");
    }

    public void componentOperation(){
        super.componentOperation();
        decorator();
    }
}
