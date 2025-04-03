import java.io.*;
import java.util.*;
public class problem3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int answer=0;
        int n=Integer.parseInt(br.readLine());
        int[] list=new int[n];

        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0; i<n;i++){
            list[i]=Integer.parseInt(st.nextToken());
        }

        int x=Integer.parseInt(br.readLine());

        Arrays.sort(list);
        int left=0;
        int right=n-1;
        while(left<right){
            if(list[left]+list[right]==x){
                answer++;
                left++;
                right--;
            }else if(list[left]+list[right]<x){
                left++;
            }else{
                right--;
            }
        }
        System.out.print(answer);
    }

}
