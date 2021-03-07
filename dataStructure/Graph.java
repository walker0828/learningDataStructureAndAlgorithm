import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {

    private int value;
    private LinkedList<Integer> adj[];

    public Graph(int value) {
        this.value = value;
        adj = new LinkedList[value];
        for(int i =0; i < value; ++i) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int s, int t) {
        adj[s].add(t);
        adj[t].add(s);
    }

    public void bfs(int s, int t) {
        if(s==t) return;
        boolean[] visited = new boolean[v];
        visited[s] = true;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);

    }

    public void dfs(int s, int t) {

    }

}

