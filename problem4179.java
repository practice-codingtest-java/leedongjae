import java.util.*;
import java.io.*;
public class problem4179 {
    static int[][] fire,man;
    static char[][] map;
    static int R,C;
    static int[] dx={0,0,-1,1};
    static int[] dy={-1,1,0,0};
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
            int y=now[0];
            int x=now[1];
            for(int i=0;i<4;i++){
                int ny=y+dy[i];
                int nx=x+dx[i];
                if(ny<0||ny>=R||nx<0||nx>=C)
                    continue;
                if(fire[ny][nx]!=-1||map[ny][nx]=='#') continue;
                fire[ny][nx]=fire[y][x]+1;
                fq.offer(new int[]{ny,nx});
            }
        }
        while(!mq.isEmpty()){
            int[] now=mq.poll();
            int y=now[0];
            int x=now[1];
            if(y==0||y==R-1||x==0||x==C-1){
                System.out.println(man[y][x]+1);
                return;
            }
            for(int i=0;i<4;i++){
                int ny=y+dy[i];
                int nx=x+dx[i];
                if(ny<0||ny>=R||nx<0||nx>=C) continue;
                if(man[ny][nx]!=-1||map[ny][nx]=='#') continue;
                if(fire[ny][nx]!=-1&&fire[ny][nx]<=man[y][x]+1) continue;
                man[ny][nx]=man[y][x]+1;
                mq.offer(new int[]{ny,nx});
            }
        }
        System.out.println("IMPOSSIBLE");
    }
}
