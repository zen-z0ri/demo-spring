package com.example.demospring.newj17.benchmark.jmh.l1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Stack;

public class TesB {

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    static class MyNode {
        Integer val;
        MyNode left;

        public MyNode(Integer val) {
            this.val = val;
        }

        MyNode right;
    }

    static void inorderT(MyNode root) {
        Stack<MyNode> s = new Stack<>();
        var temp = root;
        while (temp.left != null) {
            System.out.println(temp.getVal());
            s.push(temp);
            temp = temp.left;
        }
        var right = s.pop();
    }

    public static void main(String[] args) {
        var root = new MyNode(5);
        root.left = new MyNode(2, null, null);

        root.right = new MyNode(4, null, null);
        root.left.right = new MyNode(3);
        root.left.left = new MyNode(7);

//                5
//                2 4
//            7    3

    }
}
