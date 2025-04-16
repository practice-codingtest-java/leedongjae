import java.util.*;
import java.io.*;
public class problem1920 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        HashSet<Integer> hs=new HashSet<>();

        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0; i<N;i++){
            hs.add(Integer.parseInt(st.nextToken()));
        }
        int M=Integer.parseInt(br.readLine());
        StringBuilder sb=new StringBuilder();
        st=new StringTokenizer(br.readLine());
        for(int j=0;j<M;j++){
            int num=Integer.parseInt(st.nextToken());
            if(hs.contains(num)){
                sb.append(1).append("\n");
            }else{
                sb.append(0).append("\n");
            }
        }
        System.out.println(sb);


    }
}
