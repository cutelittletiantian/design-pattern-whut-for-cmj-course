package creational_singleton;

public class Client {
    public static void main(String[] args) {
        // 构造单例对象：不能直接new，这样会报错（不信你解除注释试试看）
        // Singleton singleton1 = new Singleton();
        // 构造与获取单例对象：由类直接调用静态get方法，创建工作已在内部执行完毕
        Singleton singleton = Singleton.getInstance();
        // 可按需调用业务函数
        singleton.doSomething();  /*这里有输出*/
    }
}
