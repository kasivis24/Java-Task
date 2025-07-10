public class LargestSumSubarray {
    public static void main(String[] args) {

        int[] arr = {9,9,9,8,9,5,0,1,2,3};

        int k = 3;

        int max = 0;

        int index = 0;

        int sum = 0;

        int startIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (i >= k){
                sum -= arr[index];
                if (sum > max){
                    startIndex = index;
                }
                max = Math.max(sum,max);
                index++;
            }else {
                max = Math.max(sum,max);
            }
        }

        System.out.println(max);

        for (int i = startIndex+1; i <= startIndex + 3; i++) {
            System.out.print(arr[i]+" ");
        }




    }
}
