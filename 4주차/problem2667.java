import java.io.*;
import java.util.*;

public class problem2667 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[][] map = new int[n][n];
        boolean[][] visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        ArrayList<Integer> answer = new ArrayList<>();
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    Queue<int[]> q = new LinkedList<>();
                    q.offer(new int[]{i, j});
                    visited[i][j] = true;
                    int count = 1;

                    while (!q.isEmpty()) {
                        int[] now = q.poll();
                        int x = now[0];
                        int y = now[1];

                        for (int d = 0; d < 4; d++) {
                            int nx = x + dx[d];
                            int ny = y + dy[d];

                            if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
                                if (map[nx][ny] == 1 && !visited[nx][ny]) {
                                    visited[nx][ny] = true;
                                    q.offer(new int[]{nx, ny});
                                    count++;
                                }
                            }
                        }
                    }

                    answer.add(count);
                }
            }
        }

        Collections.sort(answer);

        sb.append(answer.size()).append("\n");
        for (int num : answer) {
            sb.append(num).append("\n");
        }

        System.out.print(sb);
    }
}
