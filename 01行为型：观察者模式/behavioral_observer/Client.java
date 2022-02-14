package behavioral_observer;

public class Client {
    public static void main(String[] args) {
        // 主题（选择具体主题初始化主题接口）
        ISubject subject = new ConcreteSubject();

        // 观察者（用具体观察者依赖注入抽象观察者接口）
        // 指定了subject，观察者创建之初将自动和对应主题进行绑定
        IObserver observer = new ConcreteObserver(subject);
        IObserver observer2 = new ConcreteObserver2(subject);
        IObserver observer3 = new ConcreteObserver3(subject);

        // 主题向所有与之绑定的观察者发送了一条消息
        // 不同的观察者接到同一个消息后
        // 将按需执行自己各自不同的update()方法（响应消息），干净又卫生
        subject.notifyObservers();  /*出现三行输出*/
    }
}
