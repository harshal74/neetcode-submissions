class Solution {
    public int removeElement(int[] nums, int val) {
        int res =0;
        int[] temp = new int[nums.length];
        for (int i =0; i<nums.length; i++){
            if(nums[i]==val){
                continue;
            }else{
                temp[res]=nums[i];
                res++;
            }
        }
        for(int i=0; i<nums.length; i++){
            nums[i]=temp[i];
        }
        return res;
    }
}