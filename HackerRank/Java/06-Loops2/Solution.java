import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        for (int i = 0; i < t; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            int n = input.nextInt();

            for (int j = 0; j < n; j ++) {
                a += (int)Math.pow(2, j) * b;
                System.out.print(a + " ");
            }
            System.out.println();
        }

        input.close();
    }
}