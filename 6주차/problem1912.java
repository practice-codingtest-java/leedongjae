import java.util.*;
import java.io.*;
public class problem1912 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[] arr=new int[n];
        StringTokenizer st=new StringTokenizer(br.readLine());
        for (int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int max=arr[0];
        int now=arr[0];
        for(int i=1;i<n;i++){
            now=Math.max(arr[i],now+arr[i]);
            max=Math.max(max,now);
        }
        System.out.println(max);
    }
}
