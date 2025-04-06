class Solution {
    public boolean isPalindrome(int x) {
        int t=x;
        int d=0;
        while(x>0){
            d=d*10+x%10;
            x/=10;
        }
        if(t==d){
            return true;
        }
        return false;
    }
}