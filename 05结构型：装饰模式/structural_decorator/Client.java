package structural_decorator;

public class Client {
    public static void main(String[] args) {
        // 用具体组件动态初始化一个抽象组件
        AbComponent component = new ConcreteComponent( );
        AbComponent c = new ConcreteComponent();
        component.componentOperation();
        System.out.println();

        // 用具体装饰器1叠加扩展组件原功能
        component = new ConcreteDecorator1(component);
        component.componentOperation();  // 叠功能Buff：原+装饰1（一组输出）
        System.out.println();
        // 相当于（下同，不再赘述）：
        // AbDecorator d1 = new ConcreteDecorator1(component);
        // d1.componentOperation( );

        // 用具体装饰器2叠加扩展组件原功能
        component = new ConcreteDecorator2(component);
        component.componentOperation( );  // 叠功能Buff：原+装饰1+装饰2（一组输出）
        System.out.println();

        // 具体装饰器之间也可以互相扩展装饰
        AbDecorator decorator1 = new ConcreteDecorator1(new ConcreteComponent());  //括号中啥不重要
        AbDecorator decorator2 = new ConcreteDecorator2(decorator1);
        decorator2.componentOperation();  // 叠装饰Buff：装饰1+装饰2（一组输出）

    }
}
