import java.util.*;
import java.io.*;

public class problem10799 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        Stack<Integer> stack=new Stack<>();
        int answer=0;
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                stack.push(1);
            }else{
                stack.pop();
                if(str.charAt(i-1)=='('){
                answer+=stack.size();
                }else{
                    answer+=1;
                }
            }
        }
        System.out.println(answer);
    }
}
