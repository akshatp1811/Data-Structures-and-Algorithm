#include <stdio.h>
#include <stdlib.h>

#define MAX 100

int adj[MAX][MAX];      // Adjacency matrix
int visited[MAX];       // Visited array
int queue[MAX];         // Queue for BFS
int front = -1, rear = -1;

// Enqueue operation
void enqueue(int value) {
    if (rear == MAX - 1)
        return;
    if (front == -1)
        front = 0;
    queue[++rear] = value;
}

// Dequeue operation
int dequeue() {
    if (front == -1 || front > rear)
        return -1;
    return queue[front++];
}

// Check if queue is empty
int isEmpty() {
    return (front == -1 || front > rear);
}

// BFS traversal
void bfs(int start, int n) {
    enqueue(start);
    visited[start] = 1;

    while (!isEmpty()) {
        int current = dequeue();
        printf("%d ", current);

        for (int i = 0; i < n; i++) {
            if (adj[current][i] == 1 && !visited[i]) {
                enqueue(i);
                visited[i] = 1;
            }
        }
    }
}

// Main function
int main() {
    int n, e, u, v;

    printf("Enter number of vertices: ");
    scanf("%d", &n);

    printf("Enter number of edges: ");
    scanf("%d", &e);

    printf("Enter edges (u v) format:\n");
    for (int i = 0; i < e; i++) {
        scanf("%d %d", &u, &v);
        adj[u][v] = 1;
        adj[v][u] = 1; // For undirected graph
    }

    int start;
    printf("Enter starting vertex for BFS: ");
    scanf("%d", &start);

    printf("BFS traversal: ");
    bfs(start, n);

    return 0;
}
