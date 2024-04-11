package refresher;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        System.out.println("Enter size of array");
        n=scanner.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        display(arr);
        reverse(arr);
        display(arr);
    }
    public static void reverse(int arr[]){
        int i=0,j= arr.length-1;
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void display(int arr[]){
        for(int i:arr){
            System.out.println(i);
        }
    }

}
