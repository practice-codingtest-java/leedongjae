import java.util.*;
import java.io.*;
public class problem14002 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int[] arr=new int[N];
        int[] dp=new int[N];
        ArrayList<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<N;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
            list.get(i).add(arr[i]);
        }
        Arrays.fill(dp,1);
        //이 부분은 구글의 도움을 받음. 리스트를 내가 원하는데로 조작하는 부분의 문법적 지식 부족으로 인하여..
        for(int i = 1; i < N; i++) {
            for(int j = 0; j < i; j++) {
                if(arr[j] < arr[i]&&dp[i]<dp[j]+1) {
                    dp[i]=dp[j]+1;
                    list.get(i).clear();
                    list.get(i).addAll(list.get(j));
                    list.get(i).add(arr[i]);
                }
            }
        }
        int max=0;
        int num=0;
        for(int i=0;i<N;i++){
            if(max<dp[i]){
                max=dp[i];
                num=i;
            }
        }
        System.out.println(max);
        for(int answer:list.get(num)){
            System.out.print(answer+" ");
        }
    }
}
