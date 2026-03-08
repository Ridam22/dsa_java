class Solution {
    public int countDigits(int num) {
        int count=0;
        int temp=num;
        for(; num>0; num=num/10){
            int digit= num%10;
            if(temp%digit==0){
                count++;
            }
        }
        return count;
    }
}
