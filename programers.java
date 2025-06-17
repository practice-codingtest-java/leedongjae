import java.util.*;
public class programers {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String,List<int[]>> hm=new HashMap<>();
        HashMap<String,Integer> play=new HashMap<>();
        for(int i=0;i<genres.length;i++){
            if(hm.containsKey(genres[i])){
                hm.get(genres[i]).add(new int[]{i,plays[i]});
                play.put(genres[i], play.get(genres[i]) + plays[i]);
            }else{
                hm.put(genres[i], new ArrayList<>(List.of(new int[]{i, plays[i]})));
                play.put(genres[i],plays[i]);
            }
        }
        List<String> count=new ArrayList<>(play.keySet());
        count.sort((a,b)-> play.get(b)-play.get(a));
        List<Integer> list=new ArrayList<>();
        for(String str:count){
            List<int[]> arr=hm.get(str);
            arr.sort((a, b) -> {
                if (a[1]!=b[1]) return b[1]-a[1];
                return a[0]-b[0];
            });
            for(int i=0;i<arr.size()&&i<2;i++){
                list.add(arr.get(i)[0]);
            }
        }
        int[] answer=new int[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}