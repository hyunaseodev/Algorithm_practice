import java.util.Arrays;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] answerArr = new int[Math.max(nums1.length, nums2.length)];

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int nums1Pointer = 0;
        int nums2Pointer = 0;
        int cnt = 0;

        while (nums1Pointer < nums1.length && nums2Pointer < nums2.length) {
            if (nums1[nums1Pointer] > nums2[nums2Pointer])
                nums2Pointer++;
            else if (nums1[nums1Pointer] < nums2[nums2Pointer])
                nums1Pointer++;
            else if (nums1[nums1Pointer] == nums2[nums2Pointer]) {
                answerArr[cnt++] = nums1[nums1Pointer];
                nums1Pointer++;
                nums2Pointer++;
            }
        }

        return Arrays.copyOfRange(answerArr, 0, cnt);
    }
}