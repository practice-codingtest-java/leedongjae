import java.util.*;
import java.io.*;
public class problem5107 {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int test=1;
        while(true){
            int N=Integer.parseInt(br.readLine());
            if(N==0) break;
            HashMap<String,String> hm=new HashMap<>();
            for(int i=0; i<N;i++){
                String[] mani=br.readLine().split(" ");
                hm.put(mani[0],mani[1]);
            }
            int circle=0;
            HashSet<String> hs=new HashSet<>();
            for(String person:hm.keySet()){
                if(!hs.contains(person)){
                    String name=person;
                    while(!hs.contains(name)){
                        hs.add(name);
                        name=hm.get(name);
                    }
                    circle++;
                }
            }
            sb.append(test++).append(" ").append(circle).append("\n");
        }
        System.out.println(sb);
    }
}
