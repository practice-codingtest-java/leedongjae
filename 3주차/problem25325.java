import java.util.*;
import java.io.*;
public class problem25325 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        List<String> student=new ArrayList<>();
        HashMap<String, Integer> hm=new HashMap<>();
        for (int i=0; i<N;i++){
            String name=st.nextToken();
            student.add(name);
            hm.put(name,0);
        }
        for (int j=0; j<N;j++) {
            st=new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                String like = st.nextToken();
                hm.put(like, hm.get(like) + 1);
            }
        }
        List<Map.Entry<String,Integer>> list=new ArrayList<>(hm.entrySet());
        list.sort((o1,o2)->{
            int count=o2.getValue().compareTo(o1.getValue());
            if(count==0){
                return o1.getKey().compareTo(o2.getKey());
            }
            return count;
        });
        for(Map.Entry<String,Integer> answer:list){
            System.out.println(answer.getKey()+" "+answer.getValue());
        }
    }
}
