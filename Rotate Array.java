class Solution {
    public void rotate(int[] nums, int k) {
        int n= nums.length;
        k= k%n;
        int[] num= new int[nums.length];
        int y=0;
        for(int i=n-k; i<n; i++){
            num[y++]= nums[i];
        }
        for(int j=0; j<n-k; j++){
            num[y++]= nums[j];
        }
        for(int i=0; i<n; i++){
            nums[i]= num[i];
        }
    }
}
