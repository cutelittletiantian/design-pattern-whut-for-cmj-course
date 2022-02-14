package behavioral_command;

public class Client {
    public static void main(String[] args) {
        // 命令接收方
        Receiver receiver = new Receiver();

        // 用具体命令初始化抽象命令的接口，关联命令的接收方
        ICommand command = new ConcreteCommand(receiver);

        // 关联命令请求者和命令
        Invoker invoker = new Invoker();
        // 设定待执行命令（绑定命令到请求者），内部通过依赖注入实现
        invoker.setCommand(command);

        // 执行命令，由请求者调用，关联的接收方将自动执行
        invoker.executeCommand();  /*请求者一声另下，控制台输出Receiver: copy that!（接收者执行）*/
    }
}
