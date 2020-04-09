package com.bfsAnddfs;

import java.util.ArrayList;

public class Node {
    public String name;
    public ArrayList<Node> children = new ArrayList<>();
    public int mark;

    public Node(String nam){
        this.name = nam;
    }

    @Override
    public java.lang.String toString() {
        String temp = "{" + name;
                temp+= "," + mark;
                temp += "}";
        return temp;
    }
}
