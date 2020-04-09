package com.bfsAnddfs;

import java.util.Stack;

public class DFS {
    public void startSearch(Node root){
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        int counter = 1;


        while (!stack.empty()){
            System.out.println(stack);
            Node node = stack.pop();
            if (node.mark == 0){
                node.mark = counter;
                counter++;
                for (Node child: node.children) {
                    if (child.mark == 0){
                        stack.push(child);
                    }
                }
            }
        }
    }
}
