import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int max=0;
        int min=Integer.MAX_VALUE;
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            int num=Integer.parseInt(st.nextToken());
            max=Math.max(max,num);
            min=Math.min(min,num);
        }
        System.out.println(max+" "+min);
    }
}
