import java.util.*;
import java.io.*;
public class problem1647 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        List<int[]> list=new ArrayList<>();
        for(int i=0;i<m;i++){
            st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            int pay=Integer.parseInt(st.nextToken());
            list.add(new int[]{a,b,pay});
        }
        list.sort(Comparator.comparingInt(o->o[2]));
        int[] arr=new int[n+1];
        for(int i=1;i<=n;i++){
            arr[i]=i;
        }
        int total=0;
        int count=0;

        for(int[] now:list){
            int a=now[0];
            int b=now[1];
            int pay=now[2];

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
                total+=pay;
                count=pay;
            }
        }
        System.out.println(total-count);
    }
}
