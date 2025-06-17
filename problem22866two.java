import java.util.*;
import java.io.*;
public class problem22866two {
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
            Stack<Integer> leftst=new Stack<>();
            Stack<Integer> rightst=new Stack<>();
            int left=0;
            int right=Integer.MAX_VALUE;
            int answer=0;
            for(int j=i;j>=0;j--){
                if(arr[i]<arr[j]){
                    leftst.push(j);
                    left=Math.max(left,j);
                }
            }
            for(int j=i;j<n;j++){
                if(arr[i]<arr[j]){
                    rightst.push(j);
                    right=Math.min(right,j);
                }
            }
            if((i-left)>(right-i)){
                answer=right;
            }else{
                answer=left;
            }
            sb.append(leftst.size()+rightst.size()).append(" ").append(answer).append("\n");
        }
        System.out.println(sb);
    }
}
