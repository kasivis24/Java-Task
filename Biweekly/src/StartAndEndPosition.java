import java.util.Arrays;

public class StartAndEndPosition {
    public static void main(String[] args) {

        int[] nums = {0};

        int target = 0;

        int left = 0;
        int right = nums.length-1;
        int index = -1;

        while (left <= right){
            int mid = (left + right) / 2;


            if (nums[mid] == target){
                index = mid;
                break;
            }

            if (target > nums[mid]){
                left = mid + 1;
            }else {
                right = mid - 1;
            }

        }

        if (index == -1){
            System.out.println(Arrays.toString(new int[]{-1,-1}));
        }else {

            int start = -1;
            int end = -1;

            for (int i = left; i <= right; i++) {
                if (nums[i] == target){
                    start = i;
                    break;
                }
            }

            for (int i = right; i >= left; i--) {
                if (nums[i] == target){
                    end = i;
                    break;
                }
            }

            System.out.println(Arrays.toString(new int[]{start,end}));

        }

    }
}
