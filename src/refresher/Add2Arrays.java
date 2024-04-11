package refresher;

import java.util.ArrayList;

public class Add2Arrays {
    public static void main(String[] args) {
        int arr1[]={1,2,3};
        int arr2[]={7,7,7,7};

        System.out.println(add2array(arr1,arr2));

    }

    public static ArrayList<Integer>add2array(int arr1[],int arr2[]){
        ArrayList<Integer>result=new ArrayList<>();
        int i= arr1.length-1,j= arr2.length-1;

        int carry=0;

        while(i>=0 || j>=0){
            int sum=0;
            if(i>=0){
                sum+=arr1[i];
            }
            if(j>=0){
                sum+=arr2[j];
            }
            sum+=carry;
            result.add(0,sum%10);
            carry=sum/10;
            i--;j--;
        }
        if(carry!=0){
            result.add(0,carry);
        }
        return result;
    }
}
