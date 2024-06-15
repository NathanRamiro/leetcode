import java.util.HashMap;

public class IsAnagram {

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> sLetters = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            sLetters.merge(
                    s.charAt(i),
                    1,
                    Integer::sum);

        }
        for (int i = 0; i < t.length(); i++) {
            if (sLetters.merge(t.charAt(i), -1, Integer::sum) < 0) {
                return false;
            }
        }

        return true;
    }

    // public static mergeFunction<T>(){}

    public static void main(String[] args) {

        // System.out.println(("ajflaazkjselkf").matches(".*?"+"q"+".*?"));

        boolean res = isAnagram("anagramas", "nagaramat");
        System.out.println(res);
    }
}
