import java.util.*;

class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();

        set.add(n);
        int a = n;

        while(true){
            String str = Integer.toString(a);
            char[] charArr = str.toCharArray();

            int sum = 0;
            for(char c : charArr){
                sum += (c-48) * (c-48);
            }

            if(sum == 1) return true;
            if(set.contains(sum)) return false;

            set.add(sum);
            a = sum;
        }
    }
}