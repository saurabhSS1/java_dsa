package refresher;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int num;
        Scanner scanner=new Scanner(System.in);
        num= scanner.nextInt();
        int result=0;
        while(num>=1){
          int rem=num%10;
            result=result*10+rem;
            num=num/10;

        }
        System.out.println(result);
    }
}
