import java.util.*;
import java.io.*;
public class problem11501 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<T;i++){
            int n=Integer.parseInt(br.readLine());
            int[] price=new int[n];
            StringTokenizer st=new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++){
                price[j]=Integer.parseInt(st.nextToken());
            }
            int max=price[n-1];
            long money=0;
            for(int j=n-1;j>=0;j--){
                if(max>price[j]){
                    money+=(max-price[j]);
                }else{
                    max=price[j];
                }
            }
            sb.append(money).append("\n");
        }
        System.out.println(sb);
    }
}
