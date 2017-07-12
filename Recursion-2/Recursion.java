import java.util.*;

public class Recursion {
  public static void main(String[] args){
    int a[] = {1,5,4,6,11,11,2,2,3,3};
    System.out.println(groupSum(0, a, 12));
    System.out.println(groupSum6(0, a, 14));
    System.out.println(groupNoAdj(0, a, 7));
    System.out.println(groupSum5(0, a, 9));
    System.out.println(groupSumClump(0, a, 22));
    System.out.println(splitArray(a));
  }

  public static boolean groupSum(int start, int[] nums, int target) {
    if (start >= nums.length) return (target == 0);
    if (groupSum(start + 1, nums, target - nums[start])) return true;
    if (groupSum(start + 1, nums, target)) return true;
    return false;
  }

  public static boolean groupSum6(int start, int[] nums, int target) {
    if(start==nums.length)  return (target==0);
    if(groupSum6(start+1,nums,target-nums[start]))  return true;
    if(nums[start]!=6)
      if(groupSum6(start+1,nums,target))  return true;
    return false;
  }

  public static boolean groupNoAdj(int start, int[] nums, int target) {
    if (start >= nums.length) return (target == 0);
    if (groupNoAdj(start + 2, nums, target - nums[start])) return true;
    if (groupNoAdj(start + 1, nums, target)) return true;
    return false;
  }

  public static boolean groupSum5(int start, int[] nums, int target){
    if(nums.length==start){
      return (target==0);
    }
    else if(nums.length==start+1 && nums[start]%5==0){
      if(target-nums[start]==0)
        return true;
    }
    else if(nums[start]%5==0 && nums[start+1]==1){
      if(groupSum5(start+2,nums,target-nums[start]))
        return true;
    }
    else if(nums[start]%5==0){
      if(groupSum5(start+1,nums,target-nums[start]))
        return true;
    }
    else{
      if(groupSum5(start+1,nums,target))
        return true;
      if(groupSum5(start+1,nums,target-nums[start]))
        return true;
    }
    return false;
  }

  public static boolean groupSumClump(int start, int[] nums, int target) {
    if(start >= nums.length)
        return target == 0;
    int i = start;
    int s = 0;
    while(i<nums.length && nums[start]==nums[i]){
        s += nums[i];
        i++;
    }
    if(groupSumClump(i, nums, target-s))
        return true;
    if(groupSumClump(i, nums, target))
        return true;
    return false;
  }

  public static boolean splitArray(int[] nums){
    return splitArrayHelper(0, nums, 0, 0);
  }

  public static boolean splitArrayHelper(int start, int[] nums, int g1, int g2){
    if(start >= nums.length)
      return g1==g2;
    if(splitArrayHelper(start+1, nums, g1+nums[start], g2))
      return true;
    if(splitArrayHelper(start+1, nums, g1, g2+nums[start]))
      return true;
    return false;
  }
}
