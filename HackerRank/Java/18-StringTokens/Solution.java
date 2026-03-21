import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String s = input.nextLine().trim();

        if (s.isEmpty()) {
            System.out.println(0);
            input.close();
            return;
        }
    
        String[] stringArray = s.split("[^A-Za-z]+");

        System.out.println(stringArray.length);
        
        for (String string : stringArray) {
            System.out.println(string);
        }

        input.close();
    }
}