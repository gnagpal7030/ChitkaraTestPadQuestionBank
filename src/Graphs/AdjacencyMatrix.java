package Graphs;

// For undirected graphs
public class AdjacencyMatrix {

    int [][] adjMatrix;

    public AdjacencyMatrix(int V){
        adjMatrix = new int[V + 1][ V + 1];
    }

    // add new edge in the graph
    public void addEdge(int startNode, int endNode){
        adjMatrix[startNode][endNode] = 1;
        adjMatrix[endNode][startNode] = 1;
    }

    // print the matrix
    public void displayMatrix(){
        for(int []row : adjMatrix){
            for(int r : row){
                System.out.print(r + " ");
            }
            System.out.println();
        }
    }

}
