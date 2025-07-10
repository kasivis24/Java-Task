import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class PhoneNumberKeyPad {
    public static void main(String[] args) {

        String str = "ADG-BEH";

        String result = "";

        Map<String,Integer> map = new HashMap<>();

        map.put("ABC",2);
        map.put("DEF",3);
        map.put("GHI",4);
        map.put("JKL",5);
        map.put("MNO",6);
        map.put("PQRS",7);
        map.put("TUV",8);
        map.put("WXYZ",9);
        map.put(" ",0);


        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || str.charAt(i) == ' '){

                String tempKey = helper(str.charAt(i),map);

                int getIndex = tempKey.indexOf(str.charAt(i));

                getIndex += 1;

                int value = map.get(tempKey);

                for (int j = 0; j < getIndex; j++) {
                    result += value;
                }

            }
        }


        System.out.println(result);



    }

    public static String helper (char c,Map<String,Integer> m){

        for (Map.Entry<String,Integer> map : m.entrySet()){
            String temp = map.getKey();
            for (int i = 0; i < temp.length(); i++) {
                if (temp.charAt(i) == c){
                    return map.getKey();
                }
            }
        }

        return "";
    }
}
