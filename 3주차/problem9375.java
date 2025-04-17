import java.util.*;
import java.io.*;
public class problem9375 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<N;i++){
            HashMap<String, Integer> hm=new HashMap<>();
            int M=Integer.parseInt(br.readLine());
            for(int j=0; j<M;j++){
                String[] cloth = br.readLine().split(" ");
                String Type = cloth[1];
                hm.put(Type, hm.getOrDefault(Type, 0) + 1);
            }
            int answer=1;
            for(int count:hm.values()){
                answer*=(count+1);
            }
            sb.append(answer-1).append("\n");
        }
        System.out.println(sb);
    }
}
