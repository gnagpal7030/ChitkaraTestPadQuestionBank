package Graphs;

import java.util.*;

// this is for directed graphs
public class AdjacencyList {

    List<List<Integer>> adjList;

    public AdjacencyList(int V){
        adjList = new ArrayList<>(V);
        // create empty lists
        for(int i = 0; i < V; i++){
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int startNode, int endNode){
        adjList.get(startNode).add(endNode);
    }

    public void printList(){
        for(int i = 0 ; i < adjList.size(); i++){
            if(adjList.get(i).size() == 0){
                continue;
            }
            System.out.print(i + " : ");
            for(int j = 0; j < adjList.get(i).size(); j++){
                System.out.print(adjList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
