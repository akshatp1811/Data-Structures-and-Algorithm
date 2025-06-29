import java.util.*;

public class BFSList {
    public static void bfs(ArrayList<ArrayList<Integer>> adj, int start, int n) {
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.offer(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        int n = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        // Add undirected edges
        adj.get(0).add(1); adj.get(1).add(0);
        adj.get(0).add(2); adj.get(2).add(0);
        adj.get(1).add(3); adj.get(3).add(1);
        adj.get(3).add(4); adj.get(4).add(3);

        System.out.println("BFS using Adjacency List:");
        bfs(adj, 0, n);  // Start BFS from node 0
    }
}
