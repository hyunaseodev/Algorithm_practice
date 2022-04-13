class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==0) return false;
        if(n==1) return true;

        return recur(n);
    }

    boolean recur(int r){
        if(r == 3) return true;
        else if((r/3)%3 != 0 || r%3 != 0) return false;
        else return recur(r/3);
    }
}