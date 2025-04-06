import java.io.IOException;
import java.util.*;
import java.io.*;

public class problem9012 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T=Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String hold = br.readLine();
            int count = 0;

            for (int j = 0; j < hold.length(); j++) {
                char ch = hold.charAt(j);
                if (ch == '(') {
                    count++;
                } else if (ch == ')') {
                    count--;
                    if (count < 0) {
                        sb.append("NO\n");
                        break;
                    }
                }
            }

            if (count == 0) {
                sb.append("YES\n");
            } else if (count > 0) {
                sb.append("NO\n");
            }
        }

        System.out.print(sb);
    }

}


