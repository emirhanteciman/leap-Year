import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int leapYear;
        leapYear = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter year: ");
        leapYear = input.nextInt();
        if (leapYear % 100 == 0) {
            System.out.println("YES THİS YEAR İS A LEAP YEAR");
        }else if (leapYear % 4 == 0 ) {
            System.out.println("YES THİS YEAR İS A LEAP YEAR");
        }else {
            System.out.println("THİS İS NOT A LEAP YEAR ");
        }
    }
}