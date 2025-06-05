import java.util.*;
import java.io.*;
public class problem1654 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int k=Integer.parseInt(st.nextToken());
        int n=Integer.parseInt(st.nextToken());
        List<Long> list=new ArrayList<>();
        long max=0;
        for(int i=0;i<k;i++){
            Long num=Long.parseLong(br.readLine());
            list.add(num);
            if(num>max){
                max=num;
            }
        }
        long left=1;
        long right=max+1;
        long result = 0;
        while(left<=right){
            long count=0;
            long mid=(left+right)/2;
            for(long a:list){
                count+=a/mid;
            }
            if(count>=n){
                result=mid;
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        System.out.println(result);
    }
}
