package refresher;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        float angle1,angle2,angle3;
        System.out.println("Enter 3 angles of a triangle");
        Scanner scanner=new Scanner(System.in);
        angle1= scanner.nextFloat();
        angle2= scanner.nextFloat();
        angle3= scanner.nextFloat();
        if((angle1+angle2+angle3)==180){
            System.out.println("Valid triangle");

        }
        else {
            System.out.println("Invalid triangle");
        }
    }
}
