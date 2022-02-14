package behavioral_chain;

// 抽象处理者
public abstract class AbHandler {
    // 链式结构的下一个结点
    protected AbHandler next;

    // 设置下一节点（已实现）
    public void setNextHandler(AbHandler next) {
        this.next = next;
    }

    // 当前节点处理请求方法（抽象）
    public abstract void handleRequest(String request);
}
