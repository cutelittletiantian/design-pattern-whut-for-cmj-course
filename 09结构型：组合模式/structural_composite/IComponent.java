package structural_composite;

import java.util.List;

// 统一组件接口
public interface IComponent {
    // 添加孩子节点（待实现方法，下同）
    void add(IComponent child);

    // 移除孩子节点
    void remove(IComponent child);

    // 查找孩子节点
    IComponent getChild(int num);

    // 节点业务上支持的操作
    void operation();
    // 非必要，仅作为主函数演示需要：节点名
    String getName();
    // 演示需要添加的方法（非必要）：返回所有孩子节点
    List<IComponent> getChildren();
}
