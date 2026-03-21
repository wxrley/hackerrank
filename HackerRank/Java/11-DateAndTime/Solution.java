import java.time.LocalDate;
import java.util.Scanner;

class Result {

    public static String findDay(int month, int day, int year) {
        
        LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfWeek().toString().toUpperCase();
    }

}

public class Solution {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int year = scanner.nextInt();

        String dayOfWeek = Result.findDay(month, day, year);

        System.out.println(dayOfWeek);

        scanner.close();
    }
}