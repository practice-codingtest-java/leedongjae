import java.io.*;
import java.util.*;

public class problem1268 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] classes = new int[n][5];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                classes[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = -1;
        int leader = 0;

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (i == j) continue;

                for (int k = 0; k < 5; k++) {
                    if (classes[i][k] == classes[j][k]) {
                        count++;
                        break;
                    }
                }
            }

            if (count > max) {
                max = count;
                leader = i + 1;
            }
        }

        System.out.println(leader);
    }
}
