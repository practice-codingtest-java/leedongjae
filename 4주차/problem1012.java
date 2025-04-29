import java.io.*;
import java.util.*;

public class problem1012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int testCase = 0; testCase < t; testCase++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int[][] map = new int[n][m];
            boolean[][] visited = new boolean[n][m];

            for (int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[y][x] = 1;
            }

            int count = 0;
            int[] dx = {-1, 1, 0, 0};
            int[] dy = {0, 0, -1, 1};

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (map[i][j] == 1 && !visited[i][j]) {
                        Queue<int[]> q = new LinkedList<>();
                        q.offer(new int[]{i, j});
                        visited[i][j] = true;

                        while (!q.isEmpty()) {
                            int[] now = q.poll();
                            int x = now[0];
                            int y = now[1];

                            for (int d = 0; d < 4; d++) {
                                int nx = x + dx[d];
                                int ny = y + dy[d];

                                if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                                    if (map[nx][ny] == 1 && !visited[nx][ny]) {
                                        visited[nx][ny] = true;
                                        q.offer(new int[]{nx, ny});
                                    }
                                }
                            }
                        }

                        count++;
                    }
                }
            }

            sb.append(count).append("\n");
        }

        System.out.print(sb);
    }
}
