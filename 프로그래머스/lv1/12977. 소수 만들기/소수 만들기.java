import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] nums) {
        List<Integer> sum = new ArrayList<>();

        //배열원소 3개씩 더한 값을 list에 담기
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                for(int z = j+1; z < nums.length; z++) {
                    sum.add(nums[i] + nums[j] + nums[z]);
                }
            }
        }

        return (int)sum.stream()
                        .filter(i -> isPrime(i))
                        .count();
    }

    boolean isPrime(int n){
        return IntStream.range(2, n)
                        .allMatch(i -> n % i != 0);
    }
}