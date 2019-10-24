import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> check = new ArrayList<>();
        check.add("hello");
        check.add("leetcode");
        check.add("ai");
        check.add("a.");
        check.add("aA");
        for (String s : check) {
            System.out.println(reverseVowels(s));
        }


    }

    public static String reverseVowels(String s) {
        char[] vowels = {'a','o','u','i','e','A','O','U','I','E'};
        List<Character> vow = new ArrayList<>();
        for (char vowel : vowels) {
            vow.add(vowel);
        }
        char[] str = s.toCharArray();
        int lp = 0;
        int rp = str.length-1;
        System.err.println(rp);
        while (lp < rp) {
            char temp;
            if (vow.contains(str[lp]) && vow.contains(str[rp])) {
                temp = str[lp];
                str[lp] = str[rp];
                str[rp] = temp;
                lp++;
                rp--;
            }
            else if (vow.contains(str[lp]) && !vow.contains(str[rp])) {
                rp--;
            }
            else {
                lp++;
            }

        }
        return String.valueOf(str);
    }
}
