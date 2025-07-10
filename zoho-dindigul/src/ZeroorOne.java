public class ZeroorOne {
    public static void main(String[] args) {
        int[] arr = {0,0,0,1,1,1,1,1,1};

//
        int temp = 1;
        int max = 0;


        for (int i = 1; i < arr.length; i++) {
            boolean flag = arr[i-1] == arr[i];
            temp = flag ? temp+1 : temp;
            max = temp > max ? temp : max;
            temp = flag ? temp : 1;
        }

        max = temp > max ? temp : max;


        if (max == 1){
            System.out.println("No Subarray found");
        }else {
            System.out.println(max);
        }
    }
}
