package refresher;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.printf("Hello %d%n",2);
        float age=10.0f;
        System.out.println(age);
        char abc='A';
        System.out.printf("%c\n",abc);
        int a=7;
        float b=9.0f;
        float    sum=a+b;
        System.out.println(a+b);

        char expr='A';
        switch (expr){
            case 'A':
                System.out.println("zero");
                break;

            case '1':
                System.out.println("one");
                break;

            default:
                System.out.println("Default");
                break;
        }
        Scanner scanner=new Scanner(System.in);
        int number= scanner.nextInt();
        if(number%2==0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
        char ch=70;

    }
}
