import java.io.IOException;
import java.util.*;
import java.io.*;

public class problem1475 {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String N=br.readLine();
        int[] arr=new int[10];
        for(int i=0;i<N.length();i++){
            int num=Character.getNumericValue(N.charAt(i));
            if(num==9){
                arr[6]++;
            }else{
                arr[num]++;
            }
        }
        arr[6]=(arr[6]+1)/2;
        int max=0;
        for (int i=0;i<10;i++){
            max=Math.max(max,arr[i]);
        }
//        if(max==arr[6]){
//            if(max%2==1){
//                max=(max+1)/2;
//            }else{
//                max/=2;
//            }
//        }
        System.out.println(max);
    }
}
