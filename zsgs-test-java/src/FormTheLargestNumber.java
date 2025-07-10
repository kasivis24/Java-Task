import java.util.HashSet;
import java.util.Set;

public class FormTheLargestNumber {
    public static void main(String[] args) {

         int[] arr = {1,2,3,4,5};

         String[] max = {"0"};

         fun(arr,new HashSet<>(),"",max);

        System.out.println(max[0]);





    }

    public static void fun(int[] arr, Set<Integer> set,String temp,String[] max){


        if (set.size() == arr.length){
            int tempMax = Math.max(Integer.valueOf(temp),Integer.valueOf(max[0]));
            max[0] = ""+tempMax;
            return;

        }

        for (int i = 0; i < arr.length; i++) {
            if (set.add(i)){
                String t = temp;
                temp += arr[i];
                fun(arr,set,temp,max);
                temp = t;
                set.remove(Integer.valueOf(i));
            }
        }

        return;

    }

}
