package refresher;

import java.util.Scanner;

public class FIndMax {
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner scanner=new Scanner(System.in);
        num1= scanner.nextInt();
        num2= scanner.nextInt();
        num3= scanner.nextInt();
        int result;
        result=num1>=num2?(num1>=num3?num1:num3):
                (num2>=num3?num2:num3);
        System.out.println(result);
    }
}
