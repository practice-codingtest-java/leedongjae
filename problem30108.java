import java.util.*;
import java.io.*;

import static java.lang.Long.compare;

public class problem30108 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        HashMap<Integer,List<Integer>> hm=new HashMap<>();
        for(int i=1;i<=n;i++){
            hm.put(i,new ArrayList<>());
        }
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=2;i<=n;i++){
            int parent=Integer.parseInt(st.nextToken());
            hm.get(parent).add(i);
        }
        long[] arr=new long[n+1];
        st=new StringTokenizer(br.readLine());
        for(int i=1;i<=n;i++){
            arr[i]=Long.parseLong(st.nextToken());
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((o1,o2) -> compare(arr[o2],arr[o1]));
        pq.add(1);
        long answer=0;
        for(int i=1;i<=n;i++){
            int now=pq.poll();
            answer+=arr[now];
            System.out.println(answer);
            for(int next:hm.get(now)){
                pq.add(next);
            }
        }
    }
}
