import java.util.*;
import java.io.*;
public class problem15900 {
    static ArrayList<Integer>[] graph;
    static int answer=0;
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        graph=new ArrayList[N+1];
        for(int i=1;i<=N;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=1;i<N;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int x=Integer.parseInt(st.nextToken());
            int y=Integer.parseInt(st.nextToken());
            graph[x].add(y);
            graph[y].add(x);
        }
        dfs(1,0,0);
        System.out.println(answer%2==0?"No":"Yes");
    }
    static void dfs(int x, int num, int count){
        if(graph[x].size()==1&&graph[x].get(0)==num){
            answer+=count;
        }
        for(int i:graph[x]){
            if(i==num){
                continue;
            }
            dfs(i,x,count+1);
        }
    }
}
