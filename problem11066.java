import java.util.*;
import java.io.*;
public class problem11066 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            int K=Integer.parseInt(br.readLine());
            StringTokenizer st=new StringTokenizer(br.readLine());
            int[] arr=new int[K+1];
            int[] sum=new int[K+1];
            int[][] dp=new int[K+1][K+1];
            for(int j=1;j<=K;j++){
                arr[j]=Integer.parseInt(st.nextToken());
                sum[j]=sum[j-1]+arr[j];
            }
            for(int file=2;file<=K;file++){
                for(int a=1;a+file-1<= K;a++){
                    int b=a+file-1;
                    dp[a][b]=Integer.MAX_VALUE;
                    for(int c=a;c<b;c++){
                        dp[a][b]=Math.min(dp[a][b],dp[a][c]+dp[c+1][b]+sum[b]-sum[a-1]);
                    }
                }
            }
            System.out.println(dp[1][K]);
        }
    }
}
