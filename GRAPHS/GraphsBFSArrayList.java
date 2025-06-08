package GRAPHS;
import java.util.*;

 class GraphBFSArrayList {
    private ArrayList<ArrayList<Integer>> adjList;
    private int vertices;

    public GraphBFSArrayList(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    // Add edge (undirected)
    public void addEdge(int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u);  // Remove this line for directed graph
    }

    // BFS using Queue
    public void bfs(int start) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        System.out.print("BFS Traversal: ");
        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            for (int neighbor : adjList.get(current)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        GraphBFSArrayList graph = new GraphBFSArrayList(6);  // 0 to 5 nodes
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
    }
}
