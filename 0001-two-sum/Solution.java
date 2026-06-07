import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        var complements = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < nums.length; i++) {
            Integer index = complements.get(nums[i]);
          
            if (index != null) {
                return new int[] {index, i};
            } else {
                complements.put(target - nums[i], i);
            }
        }
        return null;
    }
}
