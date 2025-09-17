import java.util.Arrays;
public class att {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 5;
        int index[] = twoSum(nums, target);
        System.out.println("target" +Arrays.toString(index));

    }

        public static int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == target - nums[i]) {
                        return new int[] { i, j };
                    }
                }
            }
            return new int[] {};
     }
}



