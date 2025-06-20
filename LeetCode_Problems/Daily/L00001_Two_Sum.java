package LeetCode_Problems.Daily;

import java.util.Arrays;

public class L00001_Two_Sum 
{
    public static void main(String[] args) {
        int [] nums ={3,5,2,6};
        int target = 5;
        L00001_Two_Sum l00001_Two_Sum = new L00001_Two_Sum();
        int ans[] = l00001_Two_Sum.twoSum(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    public int[] twoSum(int[] nums, int target) 
    {
        for(int i=0; i<nums.length; i++)
        {
            for(int j=i+1; j<nums.length; j++)
            {
                int sum = nums[i] + nums[j];
                if(sum==target)
                {
                    return new int[]{nums[i], nums[j]};
                }
            }
        }  
        return new int[]{}; 
    }
}
