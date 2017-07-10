import java.util.*;

public class Recursion {
  public static void main(String[] args){
    int a[] = {1,4,6,11,3};
    System.out.println(groupSum(0, a, 12));
    System.out.println(groupSum6(0, a, 14));
    System.out.println(groupNoAdj(0, a, 7));
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
}
