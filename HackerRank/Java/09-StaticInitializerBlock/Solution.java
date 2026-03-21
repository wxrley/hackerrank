import java.util.Scanner;

public class Solution {
    static int B, H;
    static boolean flag;

    static {
        
        Scanner input = new Scanner(System.in);

        B = input.nextInt();
        H = input.nextInt();

        try {
            if (B < 1 || H < 1) {
                throw new Exception("Breadth and height must be positive");
            } else {
                flag = true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        input.close();
    }

    public static void main(String[] args) {
        if(flag){
			int area = B * H;
			System.out.print(area);
		}
    }
}