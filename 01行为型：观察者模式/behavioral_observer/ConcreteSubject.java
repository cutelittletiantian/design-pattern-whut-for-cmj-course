package behavioral_observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements ISubject {

    // 关联多个观察者 (用Java列表类型表示)
    private List<IObserver> observers;

    public ConcreteSubject() {
        observers = new ArrayList<IObserver>();
    }

    // 绑定观察者
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    // 解绑观察者
    public void deleteObserver(IObserver observer) {
        observers.remove(observer);
    }

    // 给所有绑定的观察者推送通知
    public void notifyObservers() {
        // 遍历，“推送消息”即调用观察者的update方法，等待观察者各自的响应
        for (IObserver observer: observers) {
            observer.update();
        }
    }
}
