package structural_decorator;

public abstract class AbDecorator extends AbComponent {
    private AbComponent component;
    public AbDecorator(AbComponent component){
        this.component = component;
    }

    public void componentOperation(){
        component.componentOperation();
    }
    protected abstract void decorator();
}
