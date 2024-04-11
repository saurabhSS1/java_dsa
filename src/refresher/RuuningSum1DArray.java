package refresher;

import java.util.ArrayList;

public class RuuningSum1DArray {
    public static void main(String[] args) {
        int arr[]={1,1,1,1,1};
        System.out.println(runningSum(arr));

    }
    public  static ArrayList<Integer>runningSum(int arr[]){
        ArrayList<Integer> res=new ArrayList<>();
        int sum=0;
        for(int i=0;i< arr.length;i++){
            sum=sum+arr[i];
            res.add(sum);
        }
        return res;
    }
}
