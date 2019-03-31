package com.intuit.playground.graphs;

import java.util.LinkedList;

// TODO check what kind of implementation is required for adj list (ArrayList or Something else)
public class Graph {

    LinkedList<Integer>[] adj;
    boolean[] marked;
    int[] parent;

    public Graph(int v) {
        this.adj = (LinkedList<Integer>[]) new LinkedList[v];
        marked = new boolean[v];
        parent = new int[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }

    public void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
    }

    public int v() {
        //returns the number of vertices for graph
        return adj.length;
    }

    public Iterable<Integer> neighbour(int i) {
        return adj[i];
    }



    public void printPathToX(int x){
        while(x!=-1){
            System.out.print(x+"->");
            x= parent[x];
        }
    }
    public static void main(String[] args) {
        // Client to use Graph API

        Graph g1 = new Graph(7);
        g1.addEdge(0, 1);
        g1.addEdge(0, 2);
        g1.addEdge(0, 3);
        g1.addEdge(3, 4);
        g1.addEdge(4, 6);
        g1.addEdge(4, 5);
        g1.addEdge(6, 5);
        System.out.println(Math.max(5,66));

//        for (int i = 0; i < g1.v(); i++) {
//            System.out.print("Printing vertices adjacent to vertex:" + i + " -> ");
//            for (int neighbour : g1.neighbour(i)) {
//                System.out.print(neighbour);
//            }
//            System.out.println("");
//        }
//
//        System.out.println("Printing DFS of graph:");
//        g1.parent[0]=-1;
//        g1.DFSv2(0);

//        System.out.println(g1.hasCycle());


//        //Show me the path to reach to 6 from 0
//        System.out.println("\nPath to reach fromm 0:");
//        g1.printPathToX(6);
//
//         System.out.println("\nPath to reach from 1:");
//        g1.printPathToX(1);
    }

}
