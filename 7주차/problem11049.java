import java.util.*;
import java.io.*;
public class problem11049 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[][] arr=new int[n][2];
        for(int i=0;i<n;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            arr[i][0]=Integer.parseInt(st.nextToken());
            arr[i][1]=Integer.parseInt(st.nextToken());
        }
        int[][] dp=new int[n+1][n+1];
        for(int a=2;a<=n;a++){
            for(int i=1;i<=n-a+1;i++){
                int j=i+a-1;
                dp[i][j]=Integer.MAX_VALUE;
                for(int k=i;k<j;k++){
                    dp[i][j]=Math.min(dp[i][j],dp[i][k]+dp[k+1][j]+arr[i-1][0]*arr[k][0]*arr[j-1][1]);
                }
            }
        }
        System.out.println(dp[1][n]);
    }
}
