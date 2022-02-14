package behavioral_state;

// 具体状态A
public class ConcreteStateA implements IState {

    // 当前状态所绑定（关联）的环境
    private Context context;
    // 构造函数中，设置绑定环境
    public ConcreteStateA(Context context) {
        this.context = context;
    }

    // 当前状态下执行的业务（实现）
    public void handle() {
        // 业务处理的代码
        System.out.println("当前状态切换到：状态A，执行相应业务");

        // 在时机合适的时候（这里演示简单起见直接设置为true）切换绑定环境的状态到另一个状态B
        if (true) {
            context.setCurrentState(context.getStateB());
        }
        // 可能会有多分支条件，这里伪码不搞这么复杂
    }
}
