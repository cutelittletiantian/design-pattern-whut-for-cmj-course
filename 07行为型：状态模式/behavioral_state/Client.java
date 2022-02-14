package behavioral_state;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();

        // 反复调用request( )函数，环境内部的状态根据需要自动切换
        // 不用额外操心环境内部状态的转化了
        for (int i = 0; i < 100; i++){
            context.request();  /*输出现象：状态A与状态B交替切换*/
        }
    }
}
