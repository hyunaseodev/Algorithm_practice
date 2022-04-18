class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answerList = new ArrayList<>();

        for(int i = 0; i < numRows; i++) {
            List<Integer> tempList = new ArrayList<>();
            for(int j = 0; j <= i; j++){

                if(i > 1 && j > 0 && j < i) {
                    tempList.add(answerList.get(i - 1).get(j - 1) + answerList.get(i - 1).get(j));
                } else {
                    tempList.add(1);
                }
            }
            answerList.add(tempList);
        }

        return answerList;    
    }
}