import java.util.*;

public class Recursion {
  public static void main(String[] args){
    int a[] = {1,6,2,11,3};
    System.out.println(groupSum(0, a, 12));
  }

  public static boolean groupSum(int start, int[] nums, int target) {
    if (start >= nums.length) return (target == 0);
    if (groupSum(start + 1, nums, target - nums[start])) return true;
    if (groupSum(start + 1, nums, target)) return true;
    return false;
  }
}
