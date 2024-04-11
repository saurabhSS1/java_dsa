package refresher;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        //int number;
        int low,high;

        Scanner scanner=new Scanner(System.in);
        //number= scanner.nextInt();
        System.out.println("Enter range");
        low= scanner.nextInt();
        high= scanner.nextInt();

        printRange(low,high);



       // boolean ans =isArmstrong(number);
//        if(ans){
//            System.out.println("Armstrong");
//        }
//        else {
//            System.out.println("Not an armstrong");
//        }
    }
    public static void printRange(int low,int high){
        for (int i=low;i<=high;i++) {
            if(isArmstrong(i)){
                System.out.println(i);
            }

        }



    }
    public static boolean isArmstrong(int number){
        int count=countDigits(number);
        int original=number;
        int sum=0;
        while(number>0){
            int quo=number%10;
            sum= (int) (sum+Math.pow(quo,count));
            number=number/10;

        }
        return sum==original;

    }
    public  static int countDigits(int number){
        int count=0;
        while(number>0){
            number=number/10;
            count++;

        }
        return count;
    }
}
