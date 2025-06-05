import java.util.*;
import java.io.*;
public class problem1092two {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Integer[] ship = new Integer[n];
        for (int i = 0; i < n; i++) {
            ship[i] = Integer.parseInt(st.nextToken());
        }
        int m = Integer.parseInt(br.readLine());
        Integer[] box = new Integer[m];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++){
            box[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(ship,Collections.reverseOrder());
        Arrays.sort(box,Collections.reverseOrder());


        if(ship[0]<box[0]){
            System.out.println(-1);
            return;
        }
        int count=0;
        int move=0;
        boolean[] visited=new boolean[m];
        while(move<m){
            int now=0;
            for(int i=0;i<n;i++){
                while(now<m){
                    if(!visited[now]&&ship[i]>=box[now]) {
                        visited[now]=true;
                        move++;
                        now++;
                        break;
                    }else{
                        now++;
                    }
                }
            }
            count++;
        }
        System.out.println(count);
    }
}
