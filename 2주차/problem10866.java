import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
public class problem10866 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        Deque<Integer> deque=new LinkedList<>();

        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            String str=br.readLine();
            if(str.startsWith("push_back")){
                int num = Integer.parseInt(str.split(" ")[1]);
                deque.offerLast(num);
            }else if(str.startsWith("push_front")){
                int num = Integer.parseInt(str.split(" ")[1]);
                deque.offerFirst(num);
            }else if(str.equals("pop_front")){
                sb.append(deque.isEmpty()?-1:deque.pollFirst()).append("\n");
            }else if(str.equals("pop_back")){
                sb.append(deque.isEmpty()?-1:deque.pollLast()).append("\n");
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
        System.out.print(sb);
    }
}
