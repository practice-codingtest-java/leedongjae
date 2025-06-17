import java.util.*;
import java.io.*;
public class problem18870 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[] arr=new int[n];
        int[] sort=new int[n];
        HashMap<Integer,Integer> hm=new HashMap<>();
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
            sort[i]=arr[i];
        }
        Arrays.sort(sort);
        int num=0;
        for(int i=0;i<n;i++){
            if(!hm.containsKey(sort[i])) {
                hm.put(sort[i],num++);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append(hm.get(arr[i])).append(" ");
        }
        System.out.println(sb);
    }
}
