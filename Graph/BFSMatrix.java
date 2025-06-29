import java.util.*;

public class BFSMatrix {
    public static void bfs(int[][] adj, int start, int n) {
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.offer(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int i = 0; i < n; i++) {
                if (adj[node][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.offer(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        int n = 5; // number of vertices
        int[][] adj = new int[n][n];

        // Edges (undirected)
        adj[0][1] = 1; adj[1][0] = 1;
        adj[0][2] = 1; adj[2][0] = 1;
        adj[1][3] = 1; adj[3][1] = 1;
        adj[3][4] = 1; adj[4][3] = 1;

        System.out.println("BFS using Adjacency Matrix:");
        bfs(adj, 0, n);  // Start BFS from node 0
    }
}
