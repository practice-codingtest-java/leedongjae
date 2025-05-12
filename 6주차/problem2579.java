import java.util.*;
import java.io.*;
public class problem2579 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int[] step=new int[N+1];
        int[] dp=new int[N+1];
        for(int i=1;i<=N;i++){
            step[i]=Integer.parseInt(br.readLine());
        }
        dp[1]=step[1];
        if(N>=2){
            dp[2]=step[1]+step[2];
        }
        if(N>=3){
            dp[3]=Math.max(step[1]+step[3],step[2]+step[3]);
        }
        for (int i = 4; i <= N; i++) {
            dp[i]=Math.max(dp[i-2]+step[i],dp[i-3]+step[i-1]+step[i]);
        }
        System.out.println(dp[N]);
    }
}
