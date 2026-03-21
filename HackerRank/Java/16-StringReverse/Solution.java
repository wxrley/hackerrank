import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String A = input.next();
        String stringInverse = new StringBuilder(A).reverse().toString();

        if (A.equals(stringInverse)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        input.close();
    }
}   