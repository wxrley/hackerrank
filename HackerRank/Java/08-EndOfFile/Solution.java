import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int i = 1;
        while (input.hasNext()) {
            String line = input.nextLine();
            System.out.println(i + " " + line);
            i++;
        }

        input.close();
    }
}