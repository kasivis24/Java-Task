import java.util.*;

public class Sort {
    public static void main(String[] args) {

        int[] arr = {2, 3, 2, 4, 5, 12, 2, 3, 3, 3, 12};

        Map<Integer,Integer> freq = new HashMap<>();

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (freq.containsKey(arr[i])){
                int count = freq.get(arr[i]) + 1;
                freq.put(arr[i],count);
            }else {
                freq.put(arr[i],1);
            }
        }


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((j) == arr.length-1){
                    continue;
                }
                else if(freq.get(arr[j]) < freq.get(arr[j+1])){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
