import java.util.*;
import java.io.*;
public class problem14442 {
    static int n,m,k;
    static int[] dx={1,-1,0,0};
    static int[] dy={0,0,1,-1};
    static boolean[][][] visited;
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());
        k=Integer.parseInt(st.nextToken());
        int[][] map=new int[n][m];
        for(int i=0;i<n;i++){
            String s=br.readLine();
            for(int j=0;j<m;j++){
                map[i][j]=s.charAt(j)-'0';
            }
        }
        System.out.println(bfs(map));
    }
    public static int bfs(int[][] map){
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{0,0,1,0});
        visited=new boolean[n][m][k+1];
        visited[0][0][0]=true;
        while(!q.isEmpty()){
            int[] now=q.poll();
            int x=now[0];
            int y=now[1];
            int count=now[2];
            int use=now[3];
            if(x==n-1&&y==m-1) return count;
            for(int i=0;i<4;i++){
                int nx=x+dx[i];
                int ny=y+dy[i];
                if(nx>=0&&nx<n&&ny>=0&&ny<m){
                    if(!visited[nx][ny][use]&&map[nx][ny]==0){
                        q.add(new int[]{nx,ny,count+1,use});
                        visited[nx][ny][use]=true;
                    }else if(map[nx][ny]==1&&use<k&&!visited[nx][ny][use+1]){
                        q.add(new int[]{nx,ny,count+1,use+1});
                        visited[nx][ny][use+1]=true;
                    }
                }
            }
        }
        return -1;
    }
}
