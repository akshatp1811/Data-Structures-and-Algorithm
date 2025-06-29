#include <stdio.h>
#include <stdlib.h>

#define MAX 100

// Node structure for adjacency list
typedef struct Node {
    int vertex;
    struct Node* next;
} Node;

// Queue structure for BFS
int queue[MAX], front = -1, rear = -1;

void enqueue(int val) {
    if (rear == MAX - 1) return;
    if (front == -1) front = 0;
    queue[++rear] = val;
}

int dequeue() {
    if (front == -1 || front > rear) return -1;
    return queue[front++];
}

int isEmpty() {
    return front == -1 || front > rear;
}

// Create a node
Node* createNode(int v) {
    Node* newNode = malloc(sizeof(Node));
    newNode->vertex = v;
    newNode->next = NULL;
    return newNode;
}

// Graph structure
typedef struct Graph {
    int numVertices;
    Node** adjLists; // Array of pointers to Node
    int* visited;
} Graph;

// Create graph
Graph* createGraph(int vertices) {
    Graph* graph = malloc(sizeof(Graph));
    graph->numVertices = vertices;

    graph->adjLists = malloc(vertices * sizeof(Node*));
    graph->visited = malloc(vertices * sizeof(int));

    for (int i = 0; i < vertices; i++) {
        graph->adjLists[i] = NULL;
        graph->visited[i] = 0;
    }

    return graph;
}

// Add edge
void addEdge(Graph* graph, int src, int dest) {
    // Add edge src -> dest
    Node* newNode = createNode(dest);
    newNode->next = graph->adjLists[src];
    graph->adjLists[src] = newNode;

    // Add edge dest -> src (undirected)
    newNode = createNode(src);
    newNode->next = graph->adjLists[dest];
    graph->adjLists[dest] = newNode;
}

// BFS algorithm
void bfs(Graph* graph, int startVertex) {
    graph->visited[startVertex] = 1;
    enqueue(startVertex);

    while (!isEmpty()) {
        int currentVertex = dequeue();
        printf("%d ", currentVertex);

        Node* temp = graph->adjLists[currentVertex];

        while (temp) {
            int adjVertex = temp->vertex;

            if (!graph->visited[adjVertex]) {
                graph->visited[adjVertex] = 1;
                enqueue(adjVertex);
            }
            temp = temp->next;
        }
    }
}

// Main function
int main() {
    int vertices, edges, u, v;

    printf("Enter number of vertices: ");
    scanf("%d", &vertices);

    Graph* graph = createGraph(vertices);

    printf("Enter number of edges: ");
    scanf("%d", &edges);

    printf("Enter edges (u v) format:\n");
    for (int i = 0; i < edges; i++) {
        scanf("%d %d", &u, &v);
        addEdge(graph, u, v);
    }

    int start;
    printf("Enter starting vertex for BFS: ");
    scanf("%d", &start);

    printf("BFS traversal: ");
    bfs(graph, start);

    return 0;
}
