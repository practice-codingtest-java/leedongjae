import java.util.*;
import java.io.*;
public class problem4179 {
    static int[][] fire,man;
    static char[][] map;
    static int R,C;
    static int[] dx={-1,1,0,0};
    static int[] dy={0,0,-1,1};
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        R=Integer.parseInt(st.nextToken());
        C=Integer.parseInt(st.nextToken());
        Queue<int[]> mq=new ArrayDeque<>();
        Queue<int[]> fq=new ArrayDeque<>();
        fire=new int[R][C];
        man=new int[R][C];
        map=new char[R][C];
        for(int a=0;a<R;a++){
            Arrays.fill(fire[a],-1);
            Arrays.fill(man[a],-1);
        }
        for(int i=0; i<R;i++){
            String str=br.readLine();
            for(int j=0;j<C;j++){
                map[i][j]=str.charAt(j);
                if(str.charAt(j)=='J'){
                    mq.offer(new int[]{i,j});
                    man[i][j]=0;
                }else if(str.charAt(j)=='F'){
                    fq.offer(new int[]{i,j});
                    fire[i][j]=0;
                }
            }
        }
        while(!fq.isEmpty()){
            int[] now=fq.poll();
            int x=now[0];
            int y=now[1];
            for(int i=0;i<4;i++){
                int ny=y+dy[i];
                int nx=x+dx[i];
                if(nx<0||nx>=R||ny<0||ny>=C)
                    continue;
                if(fire[nx][ny]!=-1||map[nx][ny]=='#') continue;
                fire[nx][ny]=fire[x][y]+1;
                fq.offer(new int[]{nx,ny});
            }
        }
        while(!mq.isEmpty()){
            int[] now=mq.poll();
            int x=now[0];
            int y=now[1];
            if(x==0||x==R-1||y==0||y==C-1){
                System.out.println(man[x][y]+1);
                return;
            }
            for(int i=0;i<4;i++){
                int ny=y+dy[i];
                int nx=x+dx[i];
                if(nx<0||nx>=R||ny<0||ny>=C) continue;
                if(man[nx][ny]!=-1||map[nx][ny]=='#') continue;
                if(fire[nx][ny]!=-1&&fire[nx][ny]<=man[x][y]+1) continue;
                man[nx][ny]=man[x][y]+1;
                mq.offer(new int[]{nx,ny});
            }
        }
        System.out.println("IMPOSSIBLE");
    }
}
