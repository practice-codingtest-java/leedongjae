import java.util.*;
import java.io.*;

public class problem16933 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        int[][] map = new int[n][m];
        boolean[][][][] visited = new boolean[n][m][k + 1][2];
        for (int i =0;i<n;i++) {
            String str=br.readLine();
            for (int j=0;j<m;j++){
                map[i][j]=str.charAt(j)-'0';
            }
        }
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{0,0,1,0});
        visited[0][0][0][1]=true;
        int[] dx={1,-1,0,0};
        int[] dy={0,0,1,-1};
        while (!q.isEmpty()){
            int[] now=q.poll();
            int x=now[0];
            int y=now[1];
            int count=now[2];
            int use=now[3];
            int day=count%2;
            if (x==n-1&&y==m-1) {
                System.out.println(count);
                return;
            }
            for (int i=0;i<4;i++){
                int nx=x+dx[i];
                int ny=y+dy[i];
                if (nx<0||ny<0||nx>=n||ny>=m) continue;
                if (map[nx][ny]==0&&!visited[nx][ny][use][1-day]){
                    visited[nx][ny][use][1-day]=true;
                    q.add(new int[]{nx,ny,count+1,use});
                }
                if (map[nx][ny]==1&&use<k&&day==1&&!visited[nx][ny][use+1][1-day]){
                    visited[nx][ny][use+1][1-day]=true;
                    q.add(new int[]{nx,ny,count+1,use+1});
                }
            }
            if (day == 0 && !visited[x][y][use][1 - day]) {
                visited[x][y][use][1 - day] = true;
                q.add(new int[]{x, y, count + 1, use});
            }
        }
        System.out.println("-1");
    }
}
