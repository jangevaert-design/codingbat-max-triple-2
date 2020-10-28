public class MaxTriple2 {
  public int maxTriple(int[] nums) {
    int max = 0;

    max = Math.max(nums[0], Math.max(nums[nums.length / 2], nums[nums.length -1]));
    return max;
  }
}
