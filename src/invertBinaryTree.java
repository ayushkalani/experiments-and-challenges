package com.ayush;

public class invertBinaryTree {

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){};
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        };

    }

    public static TreeNode invertBT(TreeNode root){
        if(root == null){
            return root;
        }
        TreeNode left = invertBT(root.left);
        TreeNode right = invertBT(root.right);
        root.left = right;
        root.right = left;
        return root;

    }
    public static void main(String[] args){

    }
}
