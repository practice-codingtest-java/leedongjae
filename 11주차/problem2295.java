import java.util.*;
import java.io.*;
public class problem2295 {
    static List<List<Integer>> list=new ArrayList<>();
    static int[] arr;
    static HashSet<Integer> hs;
    static int n;
    static int max=Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        list=new ArrayList<>();
        hs=new HashSet<>();
        n=Integer.parseInt(br.readLine());
        arr=new int[n];
        for(int i=0;i<n;i++){
            int a=Integer.parseInt(br.readLine());
            arr[i]=a;
            hs.add(a);
        }
        dfs(0,0,0);
        System.out.println(max);
    }
    public static void dfs(int s,int count,int sum){
        if(count==3){
            if(hs.contains(sum)){
                max=Math.max(max,sum);
            }
            return;
        }
        for(int i=s;i<n;i++){
            dfs(i+1,count+1,sum+arr[i]);
        }
    }
}
