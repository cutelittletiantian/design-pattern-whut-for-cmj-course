package structural_composite;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class Composite implements IComponent {

    // 存储子节点信息
    private List<IComponent> children;

    // 非必要变量，仅作为主函数演示需要：节点名
    private String name;
    public String getName() {
        return name;
    }

    public Composite(String name) {
        this.children = new ArrayList<IComponent>();
        this.name = name;
    }

    // 添加孩子节点
    public void add(IComponent child) {
        children.add(child);
    }

    // 移除孩子节点
    public void remove(IComponent child) {
        children.remove(child);
    }

    // 查找孩子节点
    public IComponent getChild(int num) {
        return children.get(num);
    }

    // 演示需要添加的方法（非必要）：返回所有孩子节点
    public List<IComponent> getChildren() {
        return children;
    }

    // 组合对象节点业务上支持的操作
    public void operation() {
        // 输出节点名称
        System.out.println(name + "（非叶子节点）");
    }

    // 可附加组合对象结点的其它特殊操作
}
