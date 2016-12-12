package com.joseph.composite;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by lfwang on 2016/12/9.
 */
public class TreeNode {

    private String name;
    private TreeNode parent;
    private Vector<TreeNode> children = new Vector<>();

    public TreeNode(String name) {
        this.name = name;
    }

    /**
     * 添加子节点
     * @param node
     */
    public void add(TreeNode node) {
        children.add(node);
    }

    /**
     * 删除子节点
     * @param node
     */
    public void remove(TreeNode node) {
        children.remove(node);
    }

    public Enumeration<TreeNode> getChildren() {
        return children.elements();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }
}
