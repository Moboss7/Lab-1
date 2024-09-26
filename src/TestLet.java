import java.util.Arrays;
import java.util.HashMap;
//import java.util.Map;

public class TestLet {

    public static void main(String[] args) {
     int[] twoss = new int[] {3,6,4,5,1};


        System.out.println(Arrays.toString(twoSum(twoss,9)));




    }

        public static int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> pairIdx = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                int num = nums[i];
                if (pairIdx.containsKey(target - num)) {
                    return new int[] {  pairIdx.get(target - num),i };
                }
                pairIdx.put(num, i);
            }

            return new int[] {};
        }

}
