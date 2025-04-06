import java.util.*;
import java.io.*;

public class problem9093 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            String[] arr=br.readLine().split(" ");
            StringBuilder sb=new StringBuilder();

            for(String content:arr){
                sb.append(new StringBuilder(content).reverse());
                sb.append(" ");
            }
            System.out.println(sb.toString());
        }
    }
}
