import java.util.*;
import java.io.*;
public class problem1697 {
    static int[] visited;
    static Queue<Integer> q;
    static int k;
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        k=Integer.parseInt(st.nextToken());
        if(n==k){
            System.out.println(0);
        }else{
            bfs(n);
        }
    }
    public static void bfs(int n){
        visited=new int[1000001];
        q=new LinkedList<>();
        q.add(n);
        visited[n]=0;
        while(!q.isEmpty()){
            int now=q.poll();
            for(int i=0;i<3;i++){
                int next;
                if(i==0){
                    next=now-1;
                }else if(i==1){
                    next=now+1;
                }else{
                    next=now*2;
                }
                if(next==k){
                    System.out.println(visited[now]+1);
                    return;
                }
                if(next>=0&&next<visited.length&&visited[next]==0){
                    q.add(next);
                    visited[next]=visited[now]+1;
                }
            }
        }
    }
}
