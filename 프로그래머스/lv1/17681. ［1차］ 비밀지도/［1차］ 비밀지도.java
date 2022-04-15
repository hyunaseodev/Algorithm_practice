class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        String[] strArr1 = new String[n];
        String[] strArr2 = new String[n];

        //arr1,arr2 원소를 이진법으로 계산
        //계산된 값을 String으로 변환
        for(int i=0; i<n; i++){
            strArr1[i] = Integer.toBinaryString(arr1[i]);
            strArr2[i] = Integer.toBinaryString(arr2[i]);

            while(n-strArr1[i].length() > 0){
                strArr1[i] = "0" + strArr1[i];
            }

            while(n-strArr2[i].length() > 0){
                strArr2[i] = "0" + strArr2[i];
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(strArr1[i].charAt(j) == '1' || strArr2[i].charAt(j) == '1') {
                    if(j == 0) answer[i] = "#";
                    else answer[i] += "#";
                }
                else {
                    if(j == 0) answer[i] = " ";
                    else answer[i] += " ";
                }
            }
        }

        //System.out.println(Arrays.toString(answer));

        return answer;
    }
}