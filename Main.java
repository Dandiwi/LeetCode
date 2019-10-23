import java.util.*;

public class Main {



    public static void main(String[] args) {
        String[] strs = new String[] {"eat", "tea", "tan", "ate", "nat", "bat"};
        groupAnagrams(strs);
        System.out.println(groupAnagrams(strs));

    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List> result = new HashMap<>();
        for (String str : strs) {
        char[] tempArr = str.toCharArray();
            Arrays.sort(tempArr);
            String key = new String(tempArr);
            //result.computeIfAbsent(key, k -> result.put(key, new ArrayList()));
            // wanted to do it that way but it throws concurrentmodificationexcetion - no way out
            if (!result.containsKey(key)) result.put(key, new ArrayList());
            result.get(key).add(str);
        }
    return new ArrayList(result.values());
    }
}   
