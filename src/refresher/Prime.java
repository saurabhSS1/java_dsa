package refresher;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int num;
        Scanner scanner=new Scanner(System.in);
        num=scanner.nextInt();
        if(num==1){
            System.out.println("Please enter other than 1");
            num=scanner.nextInt();
        }

        int i=2;
        while(i<=Math.sqrt(num))
        {
            if (num%i==0){
                System.out.println("Not prime");
                break;
            }
            i++;


            }
        if(i>Math.sqrt(num)) {
            System.out.println("Prime");
        }
        }
    }

