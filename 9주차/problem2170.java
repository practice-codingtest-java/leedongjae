import java.util.*;
import java.io.*;
public class problem2170 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[][] line=new int[n][2];
        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            line[i][0]=Integer.parseInt(st.nextToken());
            line[i][1]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(line,(a,b)->{
            if(a[0]==b[0]) return Integer.compare(a[1],b[1]);
            return Integer.compare(a[0],b[0]);
        });
        int count=0;
        int x=line[0][0];
        int y=line[0][1];
        for(int i=1;i<n;i++){
            int nowx=line[i][0];
            int nowy=line[i][1];
            if(nowx<=y){
                y=Math.max(nowy,y);
            }else{
                count+=y-x;
                x=nowx;
                y=nowy;
            }
        }
        count+=y-x;
        System.out.println(count);
    }
}
