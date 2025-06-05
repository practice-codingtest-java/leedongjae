import java.util.*;
import java.io.*;
public class problem1092 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] ship = new int[n];
        for (int i = 0; i < n; i++) {
            ship[i] = Integer.parseInt(st.nextToken());
        }
        int m = Integer.parseInt(br.readLine());
        List<Integer> box = new ArrayList<>();
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++){
            box.add(Integer.parseInt(st.nextToken()));
        }
        Arrays.sort(ship);
        Collections.sort(box);
        if(ship[n-1]<box.get(box.size()-1)){
            System.out.println(-1);
            return;
        }
        int count=0;
        while(!box.isEmpty()){
            int now=box.size()-1;
            for(int i=n-1;i>=0;i--){
                while(now>=0){
                    if(ship[i]>=box.get(now)) {
                        box.remove(now);
                        now--;
                        break;
                    }else{
                        now--;
                    }
                }
            }
            count++;
        }
        System.out.println(count);
    }
}
