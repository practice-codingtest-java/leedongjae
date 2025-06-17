import java.util.*;
import java.io.*;
public class problem9935 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        String target=br.readLine();
        int count=target.length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            sb.append(str.charAt(i));
            if(sb.length()>=count){
                if(sb.substring(sb.length()-count).equals(target)){
                    sb.delete(sb.length()-count,sb.length());
                }
            }
        }
        if(sb.length()==0){
            System.out.println("FRULA");
        }else{
            System.out.println(sb);
        }
    }
}
