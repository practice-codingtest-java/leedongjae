import java.util.*;
import java.io.*;
public class problem12865 {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        int[] dp=new int[k+1];
        int[][] product=new int[n][2];
        for(int i=0; i<n;i++){
            st=new StringTokenizer(br.readLine());
            product[i][0]=Integer.parseInt(st.nextToken());
            product[i][1]=Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < n; i++) {
            int w = product[i][0];
            int v = product[i][1];

            for (int j = k; j >= w; j--) {
                dp[j] = Math.max(dp[j], dp[j - w] + v);
            }
        }
        System.out.println(dp[k]);
    }
}
