import java.util.*;
import java.io.*;
public class problem1300two {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        long k=Long.parseLong(br.readLine());
        long left=1;
        long right=(long)n*n;
        long answer=0;
        while(left<=right){
            long count=0;
            long mid=(left+right)/2;
            for(long i=1;i<=n;i++){
                count+=Math.min(mid/i,n);
            }
            if(count>=k){
                right=mid-1;
                answer=mid;
            }else{
                left=mid+1;
            }
        }
        System.out.println(answer);
    }
}
