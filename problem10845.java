package week2;

import java.util.*;
import java.io.*;

public class problem10845 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();

        int n=Integer.parseInt(br.readLine());

        Deque<Integer> deque=new LinkedList<>();

        for(int i=0;i<n;i++){
            String str=br.readLine();
            if(str.equals("push")){
                int num = Integer.parseInt(str.split(" ")[1]);
                sb.append(deque.offerLast(num)).append("\n");
            }else if(str.equals("pop")){
                sb.append(deque.isEmpty()?-1:deque.pollFirst()).append("\n");
            }else if(str.equals("size")){
                sb.append(deque.size()).append("\n");
            }else if(str.equals("empty")){
                sb.append(deque.isEmpty()?1:0).append("\n");
            }else if(str.equals("front")){
                sb.append(deque.isEmpty()?-1:deque.peekFirst()).append("\n");
            }else if(str.equals("back")){
                sb.append(deque.isEmpty()?-1:deque.peekLast()).append("\n");
            }
        }
        System.out.println(sb);


    }
}
