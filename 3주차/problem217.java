import java.util.*;
import java.io.*;
public class problem2197 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        List<String> list=new ArrayList<>();
        for(int i=0;i<N;i++){
            list.add(br.readLine());
        }
        int max=0;
        String answer1="";
        String answer2="";

        for(int a=0;a<list.size();a++){
            for(int b=a+1;b<list.size();b++){
                String word1=list.get(a);
                String word2=list.get(b);
                int min=Math.min(word1.length(),word2.length());
                int count=0;
                for(int c=0;c<min;c++){
                    if(word1.charAt(c)!=word2.charAt(c)) break;
                    count++;
                }
                if(count>max){
                    max=count;
                    answer1=word1;
                    answer2=word2;
                }
            }
        }
        System.out.println(answer1+"\n"+answer2);
    }
}
