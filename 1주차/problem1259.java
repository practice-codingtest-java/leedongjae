import java.util.*;
import java.io.*;
//백준 1259번
public class problem1259 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        while(true){
            String num=br.readLine();
            if(num.equals("0")) break;
            String reversed = new StringBuilder(num).reverse().toString();
            if(num.equals(reversed)){
                sb.append("yes\n");
            }else{
                sb.append("no\n");
            }
        }
        System.out.println(sb);
    }
}
