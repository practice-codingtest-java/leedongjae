import java.util.*;
import java.io.*;

public class problem11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n + 1];
        arr[0]=0;
        st = new StringTokenizer(br.readLine());
        for(int i=1;i<=n;i++) {
            arr[i] = arr[i - 1] + Integer.parseInt(st.nextToken());
        }
        StringBuilder answer=new StringBuilder();
        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int x=Integer.parseInt(st.nextToken());
            int y=Integer.parseInt(st.nextToken());

            answer.append(arr[y]-arr[x-1]).append("\n");
        }
        System.out.println(answer);
    }
}
