import java.util.*;
import java.io.*;
public class problem7562 {
    static int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
    static int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};
    static int[][] visited;
    static int L;
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        for(int i=0; i<N;i++){
            L=Integer.parseInt(br.readLine());
            visited=new int[L][L];
            StringTokenizer st=new StringTokenizer(br.readLine());
            int startx=Integer.parseInt(st.nextToken());
            int starty=Integer.parseInt(st.nextToken());
            st=new StringTokenizer(br.readLine());
            int endx=Integer.parseInt(st.nextToken());
            int endy=Integer.parseInt(st.nextToken());

            System.out.println(bfs(startx,starty,endx,endy));
        }
    }
    static int bfs(int startx, int starty, int endx, int endy){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{startx, starty});
        visited[startx][starty] = 0;
        while(!q.isEmpty()){
            int[] now=q.poll();
            int x=now[0];
            int y=now[1];
            if(x==endx&&y==endy){
                return visited[x][y];
            }
            for (int i = 0; i < 8; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < L && ny < L) {
                    if (visited[nx][ny] == 0) {
                        visited[nx][ny] = visited[x][y] + 1;
                        q.offer(new int[]{nx, ny});
                    }
                }
            }
        }
        return 0;
    }
}
