package structural_composite;

import java.util.List;

public class Leaf implements IComponent {

    // 非必要变量，仅作为主函数演示需要：节点名
    private String name;
    public String getName() {
        return name;
    }

    public Leaf(String name) {
        this.name = name;
    }

    public void operation() {
        // 输出节点名称
        System.out.println(name + "（叶子节点）");
    }

    @Deprecated
    public void add(IComponent child) {
        // 叶子结点不予支持，空实现
    }

    @Deprecated
    public void remove(IComponent child) {
        // 叶子结点不予支持，空实现
    }

    @Deprecated
    public IComponent getChild(int num) {
        // 叶子结点不予支持，空实现（返回空）
        return null;
    }

    @Deprecated
    public List<IComponent> getChildren(){
        // 叶子节点不予支持，空实现（返回空）
        return null;
    }
}
