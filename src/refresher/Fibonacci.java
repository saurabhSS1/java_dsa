package refresher;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int first,second,number;
        Scanner scanner=new Scanner(System.in);
        first=scanner.nextInt();
        second= scanner.nextInt();
        System.out.println(first);
        System.out.println(second);
        number=scanner.nextInt();
        int i=2,result=0;
        while (i<number){
            result=first+second;
            first=second;
            second=result;
            i++;
            System.out.println(result);


        }System.out.println("Final "+result);

    }
}
