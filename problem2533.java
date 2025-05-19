import java.util.*;
import java.io.*;
public class problem2533 {
    static int N;
    static HashMap<Integer,List<Integer>> hm=new HashMap<>();
    static int[][] dp;
    static boolean[] visited;
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        N=Integer.parseInt(br.readLine());
        dp = new int[N + 1][2];
        visited = new boolean[N + 1];
        for(int i=1;i<=N;i++){
            hm.put(i,new ArrayList<>());
        }
        for(int i=0;i<N-1;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            hm.get(a).add(b);
            hm.get(b).add(a);
        }
        dfs(1);
        System.out.println(Math.min(dp[1][0],dp[1][1]));
    }
    static void dfs(int num){
        visited[num]=true;
        dp[num][0]=0;
        dp[num][1]=1;
        for(int near:hm.get(num)){
            if(!visited[near]){
                dfs(near);
                dp[num][0]+=dp[near][1];
                dp[num][1]+=Math.min(dp[near][0],dp[near][1]);
            }
        }
    }
}
