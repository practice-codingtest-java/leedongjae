import java.util.*;
import java.io.*;

public class problemkakao {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        ArrayList<Integer> num = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            num.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(num);
        HashSet<Integer> hs = new HashSet<>();
        for (int a = 0; a < num.size(); a++) {
            for (int b = a + 1; b < num.size(); b++) {
                for (int c = b + 1; c < num.size(); c++) {
                    hs.add(num.get(a) + num.get(b) + num.get(c));
                }
            }
        }
        List<Integer> answer = new ArrayList<>(hs);
        Collections.sort(answer);
        if (K>answer.size()) {
            System.out.println("-1");
        } else {
            System.out.println(answer.get(answer.size() - K));
        }
    }
}
