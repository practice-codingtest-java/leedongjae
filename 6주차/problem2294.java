import java.util.*;
import java.io.*;
public class problem2294 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        int[] coin=new int[n];
        int[] dp=new int[k+1];
        Arrays.fill(dp,Integer.MAX_VALUE-1);
        dp[0]=0;
        for(int i=0; i<n;i++){
            st=new StringTokenizer(br.readLine());
            coin[i]=Integer.parseInt(st.nextToken());
        }
        for(int i=1;i<=k;i++){
            for(int c:coin){
                if(i>=c){
                    dp[i]=Math.min(dp[i],dp[i-c]+1);
                }
            }
        }
        System.out.println(dp[k]==Integer.MAX_VALUE-1?-1:dp[k]);
    }
}
