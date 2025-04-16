import java.util.*;
import java.io.*;
public class problem1269 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());


        HashSet<Integer> a=new HashSet<>();
        HashSet<Integer> b=new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N;i++){
            a.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        for (int j=0;j<M;j++){
            b.add(Integer.parseInt(st.nextToken()));
        }
        List<Integer> count=new ArrayList<>();
        for(int num:a){
            if(!b.contains(num)){
                count.add(num);
            }
        }
        for(int num:b){
            if(!a.contains(num)){
                count.add(num);
            }
        }
        System.out.println(count.size());
    }
}
