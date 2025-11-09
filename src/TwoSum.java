import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    void main() {
//        Example 1:
//
//        Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
//        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//        Example 2:
//
//        Input: nums = [3,2,4], target = 6
//        Output: [1,2]
//        Example 3:
//
//        Input: nums = [3,3], target = 6
//        Output: [0,1]

        int[] nums = {3,2,4};
        int target = 6;

        IO.println(Arrays.toString(twoSum(nums, target)));;
    }

    public int[] twoSum(int[] nums, int target) {
        //nums = [2,7,11,15], target = 9
        HashMap<Integer, Integer> map = new HashMap<>(); //{{2,1}}
        for (int i = 0 ; i < nums.length; i++) {
            int requirement = target - nums[i]; //i = 0, 9 - 2 = 7, i = 1, 9 - 7 = 2
            if (map.containsKey(requirement)) {
                return new int[] {map.get(requirement), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }

    public int[] twoSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }
}
