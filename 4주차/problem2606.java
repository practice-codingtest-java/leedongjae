import java.util.*;
import java.io.*;
public class problem2606 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int A=Integer.parseInt(br.readLine());
        int B=Integer.parseInt(br.readLine());
        HashMap<Integer,List<Integer>> hm=new HashMap<>();
        for(int i=1;i<A+1;i++){
            hm.put(i,new ArrayList<>());
        }
        for(int i=0;i<B;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            hm.get(a).add(b);
            hm.get(b).add(a);
        }
        HashSet<Integer> hs=new HashSet<>();
        Queue<Integer> qu=new LinkedList<>();
        hs.add(1);
        qu.add(1);

        while(!qu.isEmpty()){
            int num=qu.poll();
            for(int j:hm.get(num)){
                if(!hs.contains(j)){
                    hs.add(j);
                    qu.add(j);
                }
            }
        }
        System.out.println(hs.size()-1);
    }

}
