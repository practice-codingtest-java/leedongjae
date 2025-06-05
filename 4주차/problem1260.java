import java.io.*;
import java.util.*;

public class problem1260 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(graph.get(i));
        }

        boolean[] visited = new boolean[n + 1];
        dfs(v, graph, visited, sb);
        sb.append("\n");

        visited = new boolean[n + 1];
        bfs(v, graph, visited, sb);
        sb.append("\n");

        System.out.print(sb);
    }

    static void dfs(int node, ArrayList<ArrayList<Integer>> graph, boolean[] visited, StringBuilder sb) {
        visited[node] = true;
        sb.append(node).append(" ");

        for (int next : graph.get(node)) {
            if (!visited[next]) {
                dfs(next, graph, visited, sb);
            }
        }
    }

    static void bfs(int start, ArrayList<ArrayList<Integer>> graph, boolean[] visited, StringBuilder sb) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int node = q.poll();
            sb.append(node).append(" ");

            for (int next : graph.get(node)) {
                if (!visited[next]) {
                    visited[next] = true;
                    q.offer(next);
                }
            }
        }
    }
}
