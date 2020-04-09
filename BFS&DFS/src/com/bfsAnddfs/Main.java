package com.bfsAnddfs;

public class Main {

    public static void main(String[] args) {
        BFS bfs = new BFS();
        DFS dfs = new DFS();
	    Node Root = CreateTree();

	    //bfs.startSearch(Root);
        dfs.startSearch(Root);
	    System.out.print(Root);
    }
    public static Node CreateTree(){
        Node A = new Node("A" );
        Node B = new Node("B" );
        Node C = new Node("C" );
        Node D = new Node("D" );
        Node E = new Node("E" );
        Node F = new Node("F" );
        Node G = new Node("G" );
        Node H = new Node("H" );

        A.children.add(B);
        A.children.add(D);
        A.children.add(E);
        B.children.add(C);
        E.children.add(F);
        F.children.add(G);
        F.children.add(H);

        B.children.add(A);
        D.children.add(A);
        E.children.add(A);
        C.children.add(B);
        F.children.add(E);
        G.children.add(F);
        H.children.add(F);
        
        return A;
    }
}
