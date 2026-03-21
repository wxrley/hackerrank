import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        
        String stringA = a.toLowerCase();
        String stringB = b.toLowerCase();

        if (a.length() != b.length()) {
            return false;
        }

        char[] stringArrayA = stringA.toCharArray();
        char[] stringArrayB = stringB.toCharArray();
        Arrays.sort(stringArrayA);
        Arrays.sort(stringArrayB);

        if (Arrays.equals(stringArrayA, stringArrayB)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}