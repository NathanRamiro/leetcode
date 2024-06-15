import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagramsFast {

    public static List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<List<String>> resultList = new ArrayList<>();
        HashMap<String, ArrayList<String>> groupsHashMap = new HashMap<>();
        char[] currChars;
        String key;

        for (String currstring : strs) {

            currChars = currstring.toCharArray();
            Arrays.sort(currChars);
            key = String.valueOf(currChars);
            groupsHashMap.putIfAbsent(key, new ArrayList<>());
            groupsHashMap.get(key).add(currstring);

        }
        for (ArrayList<String> currValue : groupsHashMap.values()) {
            resultList.add(currValue);
        }

        return resultList;
    }
}