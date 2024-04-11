package refresher;

import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        int year;
        Scanner scanner=new Scanner(System.in);
        year= scanner.nextInt();
        if((year%4==0 && year%100!=0) ||(year%400==0)){
            System.out.println("Leap year");
        }
        else {
            System.out.println("Not a leap year");
        }
    }
}
