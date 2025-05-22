import java.util.*;
import java.io.*;
public class problem1072 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int x=Integer.parseInt(st.nextToken());
        int y=Integer.parseInt(st.nextToken());
        int z=(int)((long)y*100/x);
        int left=0;
        int right=1000000000;
        int count=-1;
        while(left<=right){
            int mid=(right+left)/2;
            int num=(int)((long)(y+mid)*100/(x+mid));
            if(num!=z){
                count=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        System.out.println(count);
    }
}
