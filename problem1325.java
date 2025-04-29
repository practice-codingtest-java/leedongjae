import java.util.*;
import java.io.*;
public class problem1325 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        HashMap<Integer,HashSet<Integer>> hm=new HashMap<>();
        for(int i=1;i<n+1;i++){
            hm.put(i,new HashSet<>());
        }
        for(int j=0;j<m;j++){
            st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            if(!hm.get(b).contains(a)) {
                hm.get(b).add(a);
            }
        }
        int[] result = new int[n + 1];
        int max = 0;
        for(int k = 1; k <= n; k++) {
            HashSet<Integer> hs = new HashSet<>();
            Deque<Integer> list = new ArrayDeque<>();

            list.addAll(hm.get(k));
            hs.addAll(hm.get(k));

            while (!list.isEmpty()) {
                int current = list.pollFirst();

                for (int next : hm.get(current)) {
                    if (!hs.contains(next)) {
                        hs.add(next);
                        list.addLast(next);
                    }
                }
            }

            result[k] = hs.size();
            max = Math.max(max, result[k]);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (result[i] == max) {
                sb.append(i).append(" ");
            }
        }
        System.out.println(sb);
    }
}
