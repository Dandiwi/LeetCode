
import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] words = new String[] {"bella","label","roller"};
        List<String> strings = commonChars(words);
        System.out.println(strings);
    }
    public static List<String> commonChars(String[] words) {
        Map <Character,Integer> letters = new HashMap<>();
        char[] chars = words[0].toCharArray();
        for (char aChar : chars) {
            if (letters.containsKey(aChar)) {
                letters.put(aChar,letters.get(aChar)+1);
            }
            else {
                letters.put(aChar,1);
            }
        }
        for (String word : words) {
            for (Map.Entry<Character, Integer> entry : letters.entrySet()) {
                Character letter = entry.getKey();
                int i = checkLetters(letter, word);
                if (i<letters.get(letter)) letters.put(letter,i);
            }
        }
        List<String> result = new ArrayList<String>();
        for (Map.Entry<Character, Integer> entry : letters.entrySet()) {
            if (entry.getValue()>0) {
                for (int i=0; i<entry.getValue(); i++) {
                    result.add(entry.getKey().toString());
                }
            }
        }

        return result;
    }
    public static int checkLetters (Character letter, String word) {
        int count=0;
        for (char mapletter : word.toCharArray()) {
            if (letter.equals(mapletter)) count++;
        }
        return count;
    }
}
