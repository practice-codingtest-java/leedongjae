import java.util.*;
import java.io.*;
public class problem1541 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        String[] plus=str.split("-");
        int sum=0;
        String[] first=plus[0].split("\\+");
        for(String num:first){
            sum+=Integer.parseInt(num);
        }
        for(int i=1;i<plus.length;i++){
            String[] next=plus[i].split("\\+");
            for(String now:next){
                sum-=Integer.parseInt(now);
            }
        }
        System.out.println(sum);
    }
}
