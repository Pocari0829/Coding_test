import java.util.ArrayList;
import java.util.List;
class Solution {
    public Long[] solution(int x, int n) {
        List<Long> a = new ArrayList<>();
        for(int i=1;i<=n; i++){
            a.add((long)i*x);
        }
        return a.toArray(new Long[0]);
    }
}