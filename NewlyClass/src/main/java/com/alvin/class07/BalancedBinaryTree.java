package com.alvin.class07;


public class BalancedBinaryTree {
    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static boolean isBalanced(TreeNode root) {
        return process(root).isBalanced;
    }

    public static class Info {
        public boolean isBalanced;
        public int height;

        public Info(boolean isBalanced, int height) {
            this.isBalanced = isBalanced;
            this.height = height;
        }
    }

    public static Info process(TreeNode x) {
        if (x == null) {
            return new Info(true, 0);
        }
        Info leftInfo = process(x.left);
        Info rightInfo = process(x.right);
        int height = Math.max(leftInfo.height, rightInfo.height) + 1;
        boolean isBalanced = leftInfo.isBalanced && rightInfo.isBalanced && Math.abs(leftInfo.height - rightInfo.height) < 2;
        return new Info(isBalanced, height);
    }

    public static void main(String[] args) {
        TreeNode head = new TreeNode(1);
        head.left = new TreeNode(2);
        head.right = new TreeNode(3);
        head.left.left = new TreeNode(4);
        head.left.right = new TreeNode(5);
        head.right.left = new TreeNode(6);
        head.right.right = new TreeNode(7);
        head.left.left.left = new TreeNode(10);
        head.left.right.left = new TreeNode(8);
        head.left.right.left.right = new TreeNode(9);
        head.left.right.right = new TreeNode(11);
//        head.left.left.left = new TreeNode(8);
//        head.left.left.right = new TreeNode(9);
//        head.left.right.left = new TreeNode(10);
//        head.left.right.right = new TreeNode(11);
//        head.right.left.left = new TreeNode(12);
//        head.right.left.right = new TreeNode(13);
//        head.right.right.left = new TreeNode(14);
//        head.right.right.right = new TreeNode(15);
//        head.right.right.right.right = new TreeNode(16);
//        head.right.right.right.right.right = new TreeNode(17);
        System.out.println(isBalanced(head));
    }
}
