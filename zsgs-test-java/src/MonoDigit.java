public class MonoDigit {
    public static void main(String[] args) {

        int num = 32561;

        if (!fun("",""+num,0)){
            System.out.println("We Cannot able to make the mono digit ");
        }

    }

    public static boolean fun(String temp,String mainString,int index){

        if (index >= mainString.length()){
            if (isMono(temp)){
                System.out.println(temp);
                return true;
            }else {
                return false;
            }
        }

        String nothingTempString = temp;
        temp += mainString.charAt(index);
        if (fun(temp, mainString, index+1)){
            return true;
        }
        temp = nothingTempString;

        if (index+1 < mainString.length()){
            String addTemp = temp;
            int num1 = Integer.valueOf(""+mainString.charAt(index));
            int num2 = Integer.valueOf(""+mainString.charAt(index+1));
            int sum = num1 + num2;
            temp += sum;
            if (fun(temp, mainString, index+2)){
                return true;
            }
            temp = addTemp;
        }


        if (index+1 < mainString.length()){
            String subTemp = temp;
            int num1 = Integer.valueOf(""+mainString.charAt(index));
            int num2 = Integer.valueOf(""+mainString.charAt(index+1));
            int sub = num1 - num2;
            sub = sub < 0 ? sub * -1 : sub;
            temp += sub;
            if (fun(temp, mainString, index+2)){
                return true;
            }
            temp = subTemp;
        }

        return false;


    }

    public static boolean isMono(String temp){

        char c = temp.charAt(0);
        int count = 0;
        for (int i = 0; i < temp.length(); i++) {
            if (c == temp.charAt(i)){
                count++;
            }
        }

        return count == temp.length();
    }
}
