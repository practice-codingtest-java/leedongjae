import java.io.*;

public class problem1411 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] words = new String[N];
        for (int i = 0; i < N; i++) {
            words[i] = br.readLine();
        }

        int count = 0;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                String a = words[i];
                String b = words[j];

                if (a.length() != b.length()) continue;

                int[] map1 = new int[26];
                int[] map2 = new int[26];
                boolean shom = true;

                for (int k = 0; k < a.length(); k++) {
                    int c1 = a.charAt(k) - 'a';
                    int c2 = b.charAt(k) - 'a';

                    if (map1[c1] == 0 && map2[c2] == 0) {
                        map1[c1] = c2 + 1;
                        map2[c2] = c1 + 1;
                    } else {
                        if (map1[c1] != c2 + 1 || map2[c2] != c1 + 1) {
                            shom = false;
                            break;
                        }
                    }
                }

                if (shom) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
