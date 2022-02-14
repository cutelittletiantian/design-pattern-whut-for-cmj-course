package behavioral_strategy;

public class Client {
    public static void main(String[] args) {
        //选策略：选中具体策略1，初始化接口而非实体类
        IStrategy strategy1 = new ConcreteStrategy1();
        //填策略：根据业务确定上下文环境，用具体策略1依赖注入接口初始化
        Context context1 = new Context(strategy1);
        //做业务：上下文执行自己的业务算法
        context1.doAlgorithm();  /*有结果输出*/

        //或者你不想用策略1，想用策略2（选策略和填策略写在一起）
        Context context2 = new Context(new ConcreteStrategy2());
        context2.doAlgorithm();  /*有结果输出*/
    }
}
