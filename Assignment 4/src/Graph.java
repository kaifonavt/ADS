import java.util.*;

public class Graph {
    private final Map<Character, List<Node>> adjList = new HashMap<>();

    public void addVertex(char v) {
        adjList.putIfAbsent(v, new ArrayList<>());
    }

    public void addEdge(char u, char v, int weight) {
        addVertex(u);
        addVertex(v);
        adjList.get(u).add(new Node(v, weight));
        adjList.get(v).add(new Node(u, weight));
    }

    public void printAdjacencyList() {
        for (Map.Entry<Character, List<Node>> entry : adjList.entrySet()) {
            System.out.print(entry.getKey() + ": ");
            for (Node node : entry.getValue()) {
                System.out.print("-> " + node.destination + " (w:" + node.weight + ") ");
            }
            System.out.println();
        }
    }
    public void DFS(char startNode) {
        Map<Character, Boolean> visited = new HashMap<>();
        System.out.print("DFS Traversal: ");
        dfsRecursive(startNode, visited);
        System.out.println();
    }
    private void dfsRecursive(char v, Map<Character, Boolean> visited) {
        visited.put(v, true);
        System.out.print(v + " ");

        if (adjList.containsKey(v)) {
            for (Node node : adjList.get(v)) {
                if (!visited.getOrDefault(node.destination, false)) {
                    dfsRecursive(node.destination, visited);
                }
            }
        }
    }
    public void BFS(char startNode) {
        Map<Character, Boolean> visited = new HashMap<>();
        Queue<Character> queue = new LinkedList<>();
        visited.put(startNode, true);
        queue.add(startNode);
        System.out.print("BFS Traversal: ");
        while (!queue.isEmpty()) {
            char curr = queue.poll();
            System.out.print(curr + " ");

            if (adjList.containsKey(curr)) {
                for (Node node : adjList.get(curr)) {
                    if (!visited.getOrDefault(node.destination, false)) {
                        visited.put(node.destination, true);
                        queue.add(node.destination);
                    }
                }
            }
        }
        System.out.println();
    }
    private static class NodeDist implements Comparable<NodeDist> {
        int distance;
        char node;
        NodeDist(int distance, char node) {
            this.distance = distance;
            this.node = node;
        }
        public int compareTo(NodeDist other) {
            return Integer.compare(this.distance, other.distance);
        }
    }

    public void dijkstra(char startNode) {
        Map<Character, Integer> distances = new HashMap<>();
        Map<Character, Character> predecessors = new HashMap<>();
        PriorityQueue<NodeDist> pq = new PriorityQueue<>();
        for (char vertex : adjList.keySet()) {
            distances.put(vertex, Integer.MAX_VALUE);
        }
        distances.put(startNode, 0);
        pq.add(new NodeDist(0, startNode));
        while (!pq.isEmpty()) {
            NodeDist curr = pq.poll();
            char u = curr.node;
            int d = curr.distance;
            if (d > distances.getOrDefault(u, Integer.MAX_VALUE)) continue;
            if (adjList.containsKey(u)) {
                for (Node node : adjList.get(u)) {
                    char v = node.destination;
                    int newDist = distances.get(u) + node.weight;
                    if (newDist < distances.getOrDefault(v, Integer.MAX_VALUE)) {
                        distances.put(v, newDist);
                        predecessors.put(v, u);
                        pq.add(new NodeDist(newDist, v));
                    }
                }
            }
        }
        System.out.println("\n Dijkstra's Shortest Paths (startNode)");
        for (char node : adjList.keySet()) {
            System.out.print(node + ": " + distances.get(node) + " ");
            printPath(node, predecessors);
            System.out.println();
        }
    }
    private void printPath(char current, Map<Character, Character> parents) {
        if (!parents.containsKey(current)) {
            System.out.print(current);
            return;
        }
        printPath(parents.get(current), parents);
        System.out.print(" -> " + current);
    }
}