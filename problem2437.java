import java.util.*;
import java.io.*;
public class problem2437 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int answer=0;
        for(int i=0;i<n;i++){
            if(answer+1<arr[i]){
                break;
            }
            answer+=arr[i];
        }
        System.out.println(answer+1);
    }
}
