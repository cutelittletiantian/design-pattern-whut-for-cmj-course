package behavioral_command;

// 接收者
public class Receiver {

    // 接收者落实命令的具体要求
    public void action() {
        System.out.println("Receiver: copy that!");
    }
}
