public class TrainPlatform {
    public static void main(String[] args) {
        int[] arr = {1,5};
        int[] dep = {3,7};
        int count = 0;
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            count = 1;
            for (int j = 0; j < arr.length; j++) {
                if (i != j){
                    if (arr[j] >= arr[i] && arr[j] <= dep[i]){
                        count++;
                    }
                }
            }
            result = Math.max(result,count);
        }

        System.out.println(result);
    }
}
