import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int [commands.length];
        List<Integer> l = new ArrayList<Integer>();
        for(int i=0; i<commands.length; i++){
            for(int j=commands[i][0]-1; j<commands[i][1]; j++){
                l.add(array[j]);
            }
            Collections.sort(l);
            answer[i] = l.get(commands[i][2]-1);
            l.clear();
        }
        return answer;
    }
}