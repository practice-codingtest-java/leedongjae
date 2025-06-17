import java.util.*;
import java.io.*;
public class problem22866 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            int left=0;
            int right=0;
            int leftFirst=Integer.MAX_VALUE;
            int rightFirst=Integer.MAX_VALUE;
            int leftmax=arr[i];
            int rightmax=arr[i];
            int leftnear=0;
            int rightnear=0;
            for(int j=i-1;j>=0;j--){
                if(arr[j]>leftmax){
                    left++;
                    leftmax=arr[j];
                    int dist=i-j;
                    if(dist<leftFirst){
                        leftFirst=dist;
                        leftnear=j;
                    }
                }
            }
            for(int j=i+1;j<n;j++){
                if(arr[j]>rightmax){
                    right++;
                    rightmax=arr[j];
                    int dist=j-i;
                    if(dist<rightFirst){
                        rightFirst=dist;
                        rightnear=j;
                    }
                }
            }
            if(right+left==0){
                sb.append("0\n");
            }else{
                int now;
                if(leftFirst<rightFirst){
                    now=leftnear;
                }else if(leftFirst>rightFirst){
                    now=rightnear;
                }else{
                    now=Math.min(leftnear,rightnear);
                }
                sb.append(right+left).append(" ").append(now+1).append("\n");
;            }
        }

    System.out.println(sb);
}
}
