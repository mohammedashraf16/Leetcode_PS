package easy_pr.two_sum;

import java.util.Arrays;

public class Main {
     static void main() {
        TwoSum sol = new TwoSum();
        int[] nums = {3, 2, 4};
        int target = 6;
        int [] result = sol.twoSum(nums,target);
        System.out.println(Arrays.toString(result));
    }
}
