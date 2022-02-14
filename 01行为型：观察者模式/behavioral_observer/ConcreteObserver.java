package behavioral_observer;

public class ConcreteObserver implements IObserver {

    // 绑定关联的主题
    ISubject subject;

    // 构造方法（简单起见，构造时，将自己直接与主题绑定关联）
    ConcreteObserver(ISubject subject) {
        this.subject = subject;
        subject.addObserver(this);  // 绑定
    }

    public void update() {
        System.out.println("响应主题消息：观察者1号收到！");
    }
}
