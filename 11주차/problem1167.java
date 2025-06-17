import java.util.*;
import java.io.*;
public class problem1167 {
    static boolean[] visited;
    static int max=0;
    static int idx=0;
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int v=Integer.parseInt(br.readLine());
        HashMap<Integer,List<int[]>> hm=new HashMap<>();
        for(int i=1;i<=v;i++){
            hm.put(i,new ArrayList<>());
        }
        for(int i=0;i<v;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int parent=Integer.parseInt(st.nextToken());
            while(true){
                int child=Integer.parseInt(st.nextToken());
                if(child==-1) break;
                int dist=Integer.parseInt(st.nextToken());
                hm.get(parent).add(new int[]{child,dist});
            }
        }
        visited=new boolean[v+1];
        dfs(1,0,hm);

        visited=new boolean[v+1];
        dfs(idx,0,hm);

        System.out.println(max);
    }
    static void dfs(int num,int count,HashMap<Integer,List<int[]>> hm){
        visited[num]=true;
        if(count>max){
            max=count;
            idx=num;
        }
        for(int[] next:hm.get(num)){
            if(!visited[next[0]]){
                dfs(next[0],count+next[1],hm);
            }
        }
    }
}
