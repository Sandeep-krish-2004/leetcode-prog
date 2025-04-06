class Solution {
    public int reverse(int x) {
     double c=0;
     while(x!=0){
        c=c*10+x%10;
        x/=10;
     }  
     if((c>Math.pow(2,31)||(c<Math.pow(-2,31)))){
        return 0;
     } 
     return (int)c;
    }
}