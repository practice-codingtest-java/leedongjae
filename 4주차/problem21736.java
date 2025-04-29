import java.util.*;
import java.io.*;

public class problem21736 {
    static int N, M, sx, sy;
    static String[][] map;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new String[N][M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = String.valueOf(line.charAt(j));
                if (map[i][j].equals("I")) {
                    sx = i;
                    sy = j;
                }
            }
        }

        int num = bfs(sx, sy);

        if (num == 0) System.out.println("TT");
        else System.out.println(num);
    }

    static int bfs(int x, int y) {
        int num = 0;

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x, y});

        boolean[][] visited = new boolean[N][M];
        visited[x][y] = true;

        while (!q.isEmpty()) {
            int[] p = q.poll();

            if (map[p[0]][p[1]].equals("P")) num++;

            for (int i = 0; i < 4; i++) {
                int nx = p[0] + dx[i];
                int ny = p[1] + dy[i];

                if (nx >= 0 && ny >= 0 && nx < N && ny < M) {
                    if (!map[nx][ny].equals("X") && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        q.offer(new int[]{nx, ny});
                    }
                }
            }
        }
        return num;
    }
}
