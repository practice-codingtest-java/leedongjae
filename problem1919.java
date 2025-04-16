import java.util.*;
import java.io.*;
public class problem1919 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String a= br.readLine();
        String b= br.readLine();
        int[] alpha=new int[26];
        int count=0;
        for(char c:a.toCharArray()){
            alpha[c-'a']++;
        }
        for(char c:b.toCharArray()){
            alpha[c-'a']--;
        }
        for(int i=0; i<alpha.length; i++){
            if(alpha[i]<0){
                count+= -alpha[i];
            }else{
                count+= alpha[i];
            }
        }
        System.out.println(count);
    }
}
