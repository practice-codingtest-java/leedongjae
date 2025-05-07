import java.util.*;
import java.io.*;
public class problem22860 {
    static int N,M;
    static HashMap<String,List<String>> hm=new HashMap<>();
    static HashMap<String,String> file=new HashMap<>();
    static int count;
    static HashSet<String> fname;
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());
        for(int i=0;i<N+M;i++){
            st= new StringTokenizer(br.readLine());
            String a=st.nextToken();
            String b=st.nextToken();
            String c=st.nextToken();
            hm.putIfAbsent(a,new ArrayList<>());
            hm.get(a).add(b);
            file.putIfAbsent(b,c);
        }
        int Q=Integer.parseInt(br.readLine());
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<Q;i++){
            String query=br.readLine();
            String[] arr=query.split("/");
            String str=arr[arr.length-1];
            count=0;
            fname=new HashSet<>();
            bfs(str);
            sb.append(fname.size()).append(" ").append(count).append("\n");
        }
        System.out.println(sb);
    }
    static void bfs(String str){
        if(!hm.containsKey(str)) return;
        for(String name:hm.get(str)){
            if(file.get(name).equals("1")){
                bfs(name);
            }else if(file.get(name).equals("0")){
                count++;
                fname.add(name);
            }

        }
    }
}
