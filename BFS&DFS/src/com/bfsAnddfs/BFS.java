package com.bfsAnddfs;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public void startSearch(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        root.mark = 1;
        int marker = 2;
        while (queue.peek() != null){
            System.out.println(queue);
            Node node = queue.poll();
            for (Node child: node.children){
                if (child.mark == 0){
                    child.mark = marker;
                    marker++;
                    queue.add(child);
                }
            }
        }
    }

}
