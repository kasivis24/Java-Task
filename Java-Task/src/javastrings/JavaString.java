package javastrings;

import java.util.HashSet;
import java.util.Set;

public class JavaString {
    public static void main(String[] args) {
        // 1. Create a program to count vowels in a given string using string functions

        String s = "aeioukasi";
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            if (isVowels(s.charAt(i))){
                set.add(s.charAt(i));
            }
        }

        System.out.println(set.size());
    }

    public static boolean isVowels(char c){
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            return true;
        }
        return false;
    }
}


class RevereseString{
    public static void main(String[] args) {

        // 2. Write a program to reverse the characters of a string.
        String s = "kasi";
        String result = "";

        for (int i = s.length()-1; i >= 0; i--) {
            result += s.charAt(i);
        }

        System.out.println(result);
    }
}


class ReverseWords{
    public static void main(String[] args) {
        String s = "i am kasi";
        String[] strArr = s.split(" ");
        String result = "";

        for (int i = strArr.length - 1; i >= 0; i--) {
            result += strArr[i] + " ";
        }

        System.out.println(result);
    }

}


class CapitalizeString{
    public static void main(String[] args) {
        String s = "i am kasi";
        String[] strArr = s.split(" ");
        String result = "";

        for (int i = 0; i < strArr.length; i++) {
            String l = ""+strArr[i].charAt(0);
            l = l.toUpperCase();
            if (strArr[i].length() > 1){
                String temp = strArr[i].substring(1,strArr[i].length());
                result += l;
                result += temp + " ";
            }else {
                result += l + " ";
            }
        }
        System.out.println(result);
    }

}

class VaildGmail{
    public static void main(String[] args) {

        String email = "kasi11vk@gmail.com";

        System.out.println(new VaildGmail().isValid(email)?"Valid":"Invalid");
    }

    public boolean isValid(String mail) {
        if(mail.charAt(0)=='@' || mail.charAt(mail.length()-1)=='.') {
            return false;
        }
        if (mail.contains("@")){
            return false;
        }
        if(!mail.endsWith(".com") && !mail.endsWith(".org") && !mail.endsWith(".in") && !mail.endsWith(".corp")) {
            return false;
        }
        return true;
    }
}

