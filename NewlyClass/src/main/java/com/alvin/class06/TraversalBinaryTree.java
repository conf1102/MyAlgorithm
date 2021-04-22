package com.alvin.class06;

public class TraversalBinaryTree {
    public static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int v) {
            value = v;
        }
    }

    //先序遍历
    public static void pre(Node head) {
        if(head == null){
            return;
        }
        System.out.println(head.value);
        pre(head.left);
        pre(head.right);
    }

    //中序遍历
    public static void in(Node head) {
        if(head == null){
            return;
        }
        in(head.left);
        System.out.println(head.value);
        in(head.right);
    }

    //后序遍历
    public static void pos(Node head) {
        if(head == null){
            return;
        }
        pos(head.left);
        pos(head.right);
        System.out.println(head.value);
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.left = new Node(2);
        head.right = new Node(3);
        head.left.left = new Node(4);
        head.left.right = new Node(5);
        head.right.left = new Node(6);
        head.right.right = new Node(7);
        head.left.left.left = new Node(8);
        head.left.left.right = new Node(9);
        head.left.right.left = new Node(10);
        head.left.right.right = new Node(11);
        head.right.left.left = new Node(12);
        head.right.left.right = new Node(13);
        head.right.right.left = new Node(14);
        head.right.right.right = new Node(15);
        pre(head);
        System.out.println("=============");
        in(head);
        System.out.println("=============");
        pos(head);
    }
}
