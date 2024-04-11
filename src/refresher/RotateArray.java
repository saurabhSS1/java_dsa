package refresher;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n= scanner.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            arr[i]= scanner.nextInt();
        }
        System.out.println("Enter the count to rotate array");
        int k= scanner.nextInt();
        rotate(arr,k);
    }
    public static void rotate(int arr[],int k){
        k=k% arr.length;
        if(k>=0){
            int temp=arr[arr.length-1];
            for (int r=1;r<=k;r++){
            for (int i= arr.length-1;i>0;i--){
                arr[i]=arr[i-1];
            }
                arr[0]=temp;
            }

        }
        else {
            k = k + arr.length;
            int temp=arr[arr.length-1];
            for (int r=1;r<=k;r++){
                for (int i= arr.length-1;i>0;i--){
                    arr[i]=arr[i-1];
                }
                arr[0]=temp;
            }

        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
