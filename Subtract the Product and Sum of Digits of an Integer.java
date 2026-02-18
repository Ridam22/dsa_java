class Solution {
    public int subtractProductAndSum(int n) {
        int mul=1;
        int sum=0;
        int temp=n;
        while(n>0){
            int digit= n%10;
            mul*=digit;
            n=n/10;
        }
        n= temp;
        while(n>0){
            int d= n%10;
            sum+=d;
            n=n/10;
        }
        return mul-sum;
    }
}
