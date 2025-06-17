import java.util.*;
import java.io.*;
public class problem2295two {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[] arr=new int[n];
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(br.readLine());
            hs.add(arr[i]);
        }

    }
}
