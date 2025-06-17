import java.util.*;
import java.io.*;
public class problem13334 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        List<int[]> list=new ArrayList<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            int start=Math.min(a,b);
            int end=Math.max(a,b);
            int minus=end-start;
            list.add(new int[]{start,end,minus});
        }
        list.sort(Comparator.comparingInt(o->o[1]));
        int d=Integer.parseInt(br.readLine());
        int max=0;
        for(int[] now:list){
            int start=now[0];
            int end=now[1];
            int minus=now[2];
            if(minus>d) continue;
            pq.add(start);
            while(!pq.isEmpty()&&pq.peek()<end-d){
                pq.poll();
            }
            max=Math.max(max,pq.size());

        }
        System.out.println(max);
    }
}
