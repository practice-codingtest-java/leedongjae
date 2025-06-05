import java.util.*;
import java.io.*;
public class problem2110 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        long n=Long.parseLong(st.nextToken());
        long c=Long.parseLong(st.nextToken());
        List<Integer> list=new ArrayList<>();
        for(int i=0; i<n;i++){
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);
        int min=1;
        int max=list.get((int) (n-1))-list.get(0);
        int answer=0;
        while(min<=max){
            int count=1;
            int mid=(min+max)/2;
            int last=list.get(0);
            for(int i=1;i<n;i++){
                if(list.get(i)-last>=mid) {
                    count++;
                    last=list.get(i);
                }
            }
            if (count >= c) {
                answer=mid;
                min=mid+1;
            } else {
                max=mid-1;
            }

        }
        System.out.println(answer);
    }
}
