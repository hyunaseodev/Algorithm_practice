import java.util.*;
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
		
		//list의 각 원소가 소수인지 확인
		//소수가 아니면 삭제
		int answer = 0;
		for(int i = 0; i < sum.size(); i++) {
			System.out.println(sum.get(i));
			int div_cnt = 0;
			for(int j = 2; j < sum.get(i); j++) {
				if(sum.get(i) % j == 0) div_cnt += 1;
				if(div_cnt > 1) break;
			}
			
			if(div_cnt == 0) {
				answer += 1;
			}
		}
        return answer;
    }
}