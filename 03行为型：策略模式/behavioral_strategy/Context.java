package behavioral_strategy;

public class Context {
    // 业务上下文关联的算法策略接口
    private IStrategy strategy;

    // 构造方法（初始化时绑定对应策略）
    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    // 执行业务算法，调用关联策略的算法
    public void doAlgorithm() {
        this.strategy.algorithm();
        // 还可能有其它业务代码，不单只有算法策略
        System.out.println("上下文执行相关策略");
    }

}
