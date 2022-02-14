package behavioral_state;

// 环境（其中各种状态可共享）
public class Context {
    // 预设状态A和状态B（相同环境下共享，所以是静态的）
    private static IState stateA, stateB;
    // 当前状态（相同环境下共享，所以是静态的）
    private static IState currentState;

    // 构造函数中，创建预设状态并将状态绑定到当前环境
    public Context() {
        stateA = new ConcreteStateA(this);
        stateB = new ConcreteStateB(this);
        // 不妨选状态A为初始的默认当前状态
        currentState = stateA;
    }

    // 设置当前状态（常在具体状态handle函数定义中被调用）
    public void setCurrentState(IState state) {
        currentState = state;
    }

    // 获取当前状态（常在具体状态handle函数定义中被调用）
    public IState getCurrentState() {
        return currentState;
    }

    // 分别获取A和B两种不同状态（具体状态handle函数定义中被调用）
    public IState getStateA() {
        return stateA;
    }

    public IState getStateB() {
        return stateB;
    }

    // 调用当前状态的handle()方法，处理业务
    public void request() {
        currentState.handle();
    }
}
