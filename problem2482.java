import java.util.*;
import java.io.*;
public class problem2482 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int k=Integer.parseInt(br.readLine());
        int[][] dp=new int[n+1][k+1];
        for(int i=0;i<=n;i++){
            dp[i][0]=1;
            dp[i][1]=i;
        }
        for(int i=4;i<=n;i++){
            for(int j=1;j<=k;j++){
                dp[i][j]=(dp[i-1][j]%1000000003+dp[i-2][j-1]%1000000003)%1000000003;
            }
        }
        int answer=(dp[n-1][k]+dp[n-2][k-1])%1000000003;
        System.out.println(answer);
    }

}
