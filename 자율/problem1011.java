import java.util.*;
import java.io.*;
public class problem1011 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            double num=b-a;
            double count=Math.sqrt(num);
            int answer=(int)count;
            if(num==answer*answer){
                System.out.println(answer*2-1);
            }else if(num<=answer*(answer+1)){
                System.out.println(answer*2);
            }else{
                System.out.println(answer*2+1);
            }

        }
    }
}
