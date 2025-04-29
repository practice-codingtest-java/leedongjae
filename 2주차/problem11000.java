import java.util.*;
import java.io.*;
public class problem11000 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        PriorityQueue<int[]> pq = new PriorityQueue<>(((o1, o2) -> {
            if(o1[0] == o2[0]){
                return o1[1] - o2[1];
            }else{
                return o1[0] - o2[0];
            }
        }));
        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            pq.offer(new int[]{start, end});
        }

        PriorityQueue<Integer> classes=new PriorityQueue<>();
        classes.offer(0);
        while(!pq.isEmpty()){
            int arr[]=pq.poll();
            if(classes.peek() <= arr[0]){
                classes.poll();
            }
            classes.offer(arr[1]);
        }
        System.out.println(classes.size());
        
    }
}
