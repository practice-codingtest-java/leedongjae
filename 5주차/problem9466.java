import java.util.*;
import java.io.*;
public class problem9466 {
    static int[] arr;
    static boolean[] visited,end;
    static int count;
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());


        for(int i=0;i<T;i++){
            int n=Integer.parseInt(br.readLine());
            arr=new int[n+1];
            visited=new boolean[n+1];
            end=new boolean[n+1];
            count=0;
            StringTokenizer st=new StringTokenizer(br.readLine());
            for(int j=1; j<= n; j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }
            for (int k=1;k<=n;k++){
                if(!end[k]){
                    dfs(k);
                }
            }
            System.out.println(n-count);
        }
    }
    public static void dfs(int n){
        if(visited[n]){
            end[n] = true;
            count++;
        }else{
            visited[n] = true;
        }

        if(!end[arr[n]]){
            dfs(arr[n]);
        }

        visited[n] = false;
        end[n] = true;
    }
}
