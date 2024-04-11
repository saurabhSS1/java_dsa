package refresher;

import java.util.Scanner;

public class ArrayMin {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= scanner.nextInt();
        }
        minimum(arr);



    }
    public  static void minimum(int arr[]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i< arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum "+min);
    }
}
