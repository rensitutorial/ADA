import java.util.Arrays;

public class pr8 {
    static int V = 4;

    static class Edge {
        int src, dest, weight;

        Edge(int s, int d, int w) {
            src = s;
            dest = d;
            weight = w;
        }
    }

    static int find(int parent[], int i) {
        while (parent[i] != i) {
            i = parent[i];
        }
        return i;
    }

    static void kruskalMST(Edge edges[]) {
        Arrays.sort(edges, (a, b) -> a.weight - b.weight);

        int parent[] = new int[V];

        for (int i = 0; i < V; i++) {
            parent[i] = i;
        }

        System.out.println("Edge \tWeight");

        int count = 0;
        int i = 0;

        while (count < V - 1) {
            Edge next = edges[i++];

            int x = find(parent, next.src);
            int y = find(parent, next.dest);

            if (x != y) {
                System.out.println(next.src + " - " + next.dest + "\t" + next.weight);
                parent[x] = y;
                count++;
            }
        }
    }

    public static void main(String[] args) {
        Edge edges[] = {
            new Edge(0, 1, 10),
            new Edge(0, 2, 6),
            new Edge(0, 3, 5),
            new Edge(1, 3, 15),
            new Edge(2, 3, 4)
        };

        kruskalMST(edges);
    }
}
