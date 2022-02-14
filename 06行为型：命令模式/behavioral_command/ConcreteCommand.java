package behavioral_command;

// 具体命令
public class ConcreteCommand implements ICommand {
    // 关联的接收者
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    // 具体命令的下发，通过关联的接收者落实执行
    public void execute() {
        this.receiver.action();
    }
}
