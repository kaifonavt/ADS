public class Main {
    public static void main(String[] args) {
        Graph myGraph = new Graph();
        char[] nodes = {'A', 'B', 'C', 'D', 'E', 'F'};
        for (char n : nodes) {
            myGraph.addVertex(n);
        }
        myGraph.addEdge('B', 'A', 3);
        myGraph.addEdge('C', 'B', 15);
        myGraph.addEdge('D', 'A', 13);
        myGraph.addEdge('D', 'B', 1);
        myGraph.addEdge('E', 'D', 2);
        myGraph.addEdge('F', 'D', 4);
        myGraph.addEdge('E', 'B', 4);

        myGraph.printAdjacencyList();
        myGraph.DFS('D');
        myGraph.BFS('D');
        myGraph.dijkstra('D');
    }
}