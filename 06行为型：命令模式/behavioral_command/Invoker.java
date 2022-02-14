package behavioral_command;

// 请求者
public class Invoker {
    // 关联的命令
    private ICommand command;

    // 请求者绑定命令（具体命令依赖注入）
    public void setCommand(ICommand command) {
        this.command = command;
    }

    // 下发命令（调用命令的execute函数）
    public void executeCommand() {
        this.command.execute();
    }
}
