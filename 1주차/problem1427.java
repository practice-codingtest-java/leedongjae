import java.io.IOException;
import java.util.*;
import java.io.*;
public class problem1427 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        char[] arr=s.toCharArray();
        Arrays.sort(arr);
        StringBuilder sb=new StringBuilder(new String(arr));
        System.out.println(sb.reverse());
    }
}
