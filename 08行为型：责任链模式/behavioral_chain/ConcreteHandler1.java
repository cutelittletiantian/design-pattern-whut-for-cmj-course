package behavioral_chain;

// 具体处理者1
public class ConcreteHandler1 extends AbHandler {

    // 当前节点处理请求方法（实现）
    public void handleRequest(String request) {
        if (next != null) {
            if (request.equals("1")) {
                System.out.println("ConcreteHandler1当前对象已受理请求1");
            } else {
                System.out.println("这个活ConcreteHandler1不负责，甩锅后面结点");
                next.handleRequest(request);
            }
        } else {
            System.out.println("当前请求没人受理");
        }
    }
}
