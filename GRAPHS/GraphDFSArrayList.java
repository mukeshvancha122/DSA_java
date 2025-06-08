package GRAPHS;

import java.util.*;

 class GraphDFSArrayList {
    private ArrayList<ArrayList<Integer>> adjList;
    private int vertices;

    public GraphDFSArrayList(int vertices) {
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

    // Iterative DFS using stack
    public void dfs(int start) {
        boolean[] visited = new boolean[vertices];
        Stack<Integer> stack = new Stack<>();

        stack.push(start);

        System.out.print("DFS Traversal (Iterative): ");
        while (!stack.isEmpty()) {
            int current = stack.pop();

            if (!visited[current]) {
                visited[current] = true;
                System.out.print(current + " ");

                // Add neighbors in reverse order for consistent traversal
                List<Integer> neighbors = adjList.get(current);
                Collections.reverse(neighbors); // optional for ordered output
                for (int neighbor : neighbors) {
                    if (!visited[neighbor]) {
                        stack.push(neighbor);
                    }
                }
                Collections.reverse(neighbors); // restore original order (important if reused)
            }
        }
    }

    public static void main(String[] args) {
        GraphDFSArrayList graph = new GraphDFSArrayList(6);  // 0 to 5 nodes
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);

        graph.dfs(0);  // Start DFS from node 0
    }
}
