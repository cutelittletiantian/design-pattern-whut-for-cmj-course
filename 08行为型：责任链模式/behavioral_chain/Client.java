package behavioral_chain;

public class Client {
    public static void main(String[] args) {
        // 建结点
        AbHandler handlerA = new ConcreteHandler1();
        AbHandler handlerB = new ConcreteHandler2();
        AbHandler handlerC = new ConcreteHandler1();
        // 组装责任链（链表），头结点为handlerA
        handlerA.setNextHandler(handlerB);
        handlerB.setNextHandler(handlerC);
        AbHandler head = handlerA;

        // 请求1
        head.handleRequest("1");  /*有第一组输出*/
        System.out.println();
        // 请求2
        head.handleRequest("2");  /*有第二组输出*/
        System.out.println();
        // 请求3（责任链中无人受理）
        head.handleRequest("3");  /*有第三组输出*/
    }
}
