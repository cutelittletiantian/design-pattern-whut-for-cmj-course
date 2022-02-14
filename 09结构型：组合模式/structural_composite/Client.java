package structural_composite;

import java.util.ArrayDeque;
import java.util.Queue;

public class Client {
    public static void main(String[] args) {
        // 创建根节点，组合对象依赖注入统一接口
        IComponent root = new Composite("Root");
        // 创建叶子节点1_1，叶子对象依赖注入统一接口
        IComponent leaf1_1 = new Leaf("-- Leaf1_1");
        // 创建其它节点同理（比较繁琐，可以跳过）
        IComponent branch1_1 = new Composite("-- Branch1_1");
        IComponent branch1_2 = new Composite("-- Branch1_2");
        IComponent branch2_1 = new Composite("---- Branch2_1");
        IComponent leaf2_1 = new Leaf("---- Leaf2_1");
        IComponent leaf2_2 = new Leaf("---- Leaf2_2");
        IComponent leaf2_3 = new Leaf("---- Leaf2_3");
        IComponent leaf3_1 = new Leaf("-------- Leaf3_1");
        // 给组合对象设置子节点，组装出一棵树
        root.add(branch1_1);
        root.add(leaf1_1);
        root.add(branch1_2);
        // 其它组装同理（比较繁锁，可以跳过）
        branch1_1.add(branch2_1);
        branch1_1.add(leaf2_1);
        branch1_2.add(leaf2_2);
        branch1_2.add(leaf2_3);
        branch2_1.add(leaf3_1);

        /*最终构造出来的树就是这样的（按层序遍历输出）*/
        Queue<IComponent> queue = new ArrayDeque<IComponent>();
        queue.add(root);
        while (!queue.isEmpty()) {
            IComponent component = queue.remove();
            System.out.println(component.getName());
            // 加入子节点
            if (component.getChildren() != null) {
                queue.addAll(component.getChildren());
            }
        }
    }
}
