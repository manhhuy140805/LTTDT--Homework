import java.util.*;

public class Main {
    public static boolean isMatch(String s, String p) {
        if(s.length() > p.length())
        {
                return false;
        }

        return true;
    }
    public static void main(String[] args) {
        String s = "abcd";
        String p = "abcd";
        System.out.println(isMatch(s, p));
    }
}
