import java.util.*;
import java.io.*;
public class problem16202 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        List<int[]> list=new ArrayList<>();
        for(int i=0;i<m;i++){
            st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            list.add(new int[]{a,b,i+1});
        }
        for(int i=0;i<k;i++){
            int[] arr=new int[n+1];
            for(int j=1;j<=n;j++){
                arr[j]=j;
            }
            int total=0;
            int count=0;
            for(int x=i;x<list.size();x++){
                int[] now=list.get(x);
                int a=now[0];
                int b=now[1];
                int num=now[2];

                while(arr[a]!=a){
                    arr[a]=arr[arr[a]];
                    a=arr[a];
                }
                while(arr[b]!=b){
                    arr[b]=arr[arr[b]];
                    b=arr[b];
                }
                if(a!=b){
                    arr[b]=a;
                    total+=num;
                    count++;
                    if(count==n-1) break;
                }
            }
            if(count==n-1) sb.append(total).append(" ");
            else sb.append("0").append(" ");
        }
        System.out.println(sb);
    }
}
