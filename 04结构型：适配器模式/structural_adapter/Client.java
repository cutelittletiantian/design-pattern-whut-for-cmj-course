package structural_adapter;

public class Client {
    public static void main(String[] args) {
        // 被适配者接口
        IAdaptee adapteeDemo = new IAdaptee() {
            // 这里现场临时造了一个接口实现，充当匿名对象
            public void methodB() {
                System.out.println("执行的IAdaptee下的methodB");
            }
        };

        // 适配器下运行的methodA
        Adapter adapterDemo = new Adapter(adapteeDemo);
        adapterDemo.methodA();  /*调A，实际输出的B，兼容完毕*/

        // 不需要兼容条件下运行的methodA（直接实现的ITarget）
        ITarget concreteTarget = new ITarget() {
            // 这里现场临时造了一个接口实现，充当匿名对象
            public void methodA() {
                System.out.println("直接执行的ITarget下的methodA");
            }
        };
        concreteTarget.methodA();  /*调A，实际输出的就是A，本身是适配的*/
    }
}
