import java.util.*;
import java.io.*;
public class problem2805 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        long n=Long.parseLong(st.nextToken());
        long m=Long.parseLong(st.nextToken());
        List<Long> list=new ArrayList<>();
        st=new StringTokenizer(br.readLine());
        long max=0;
        for(int i=0;i<n;i++){
            long a=Long.parseLong(st.nextToken());
            list.add(a);
            if(a>max) max=a;
        }
        long left=1;
        long right=max+1;
        long answer=0;
        while(left<=right){
            long count=0;
            long mid=(left+right)/2;
            for(long a:list){
                if(a>mid) count+=a-mid;
            }
            if(count>=m){
                answer=mid;
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        System.out.println(answer);
    }
}
