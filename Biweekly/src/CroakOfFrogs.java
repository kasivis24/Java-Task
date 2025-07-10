import java.util.Arrays;

public class CroakOfFrogs {
    public static void main(String[] args) {

        String croakOfFrogs = "croakcrook";

        int[] freq = new int[123];



        for (int i = 0; i < croakOfFrogs.length(); i++) {
            freq[croakOfFrogs.charAt(i)] += 1;
        }


        int same = freq[97];

        boolean flag = false;

        int len = 0;

        for (int i = 0; i < croakOfFrogs.length(); i++) {
            if (i+5 <= croakOfFrogs.length() && croakOfFrogs.substring(i,i+5).equals("croak")){
                len += 5;
                i += 4;
            }
        }

        if (len == croakOfFrogs.length()){
            System.out.println(1 + "frogs");
        } else if (!flag) {
            int size = 0;
            for (int i = 97; i < 123; i++) {
                if (freq[i] == same) {
                    size++;
                    continue;
                }
            }
            if (size != 5){
                flag = true;
            }else {
                System.out.println(same + "frogs");
            }

        } else if (flag) {
            System.out.println(-1);
        }





    }
}
