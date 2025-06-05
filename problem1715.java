import java.util.*;
import java.io.*;
public class problem1715 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<n;i++){
            pq.add(Integer.parseInt(br.readLine()));
        }
        int count=0;
        while(pq.size()>1){
            int one=pq.poll();
            int two=pq.poll();
            int sum=one+two;
            count+=sum;
            pq.add(sum);
        }
        System.out.println(count);
    }
}
