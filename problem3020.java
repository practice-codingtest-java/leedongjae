import java.util.*;
import java.io.*;
public class problem3020 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int h=Integer.parseInt(st.nextToken());
        int[] under=new int[h+1];
        int[] top=new int[h+1];
        for(int i=0;i<n;i++){
            int now=Integer.parseInt(br.readLine());
            if(i%2==0){
                under[now]++;
            }else{
                top[now]++;
            }
        }
        for(int i=h-1;i>=1;i--){
            top[i]+=top[i+1];
            under[i]+=under[i+1];
        }
        int min=Integer.MAX_VALUE;
        int count=0;
        for(int i=1;i<=h;i++){
            int now=under[i]+top[h-i+1];
            if(now<min){
                min=now;
                count=1;
            }else if(now==min){
                count++;
            }
        }
        System.out.println(min+" "+count);
    }
}
