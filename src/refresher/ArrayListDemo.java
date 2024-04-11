package refresher;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        int arr1[]={10,20,30,40,50,50,60,70};
        int arr2[]={20,30,35,40,50,60};

        System.out.println(intesection(arr1,arr2));
    }
    public static ArrayList<Integer>intesection(int arr1[],int arr2[]){
        ArrayList<Integer> result=new ArrayList<>();
        int i=0,j=0;
        while(i< arr1.length && j< arr2.length){
            if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr1[i]>arr2[j]){
                j++;
            }
            else {
                result.add(arr1[i]);
                i++;j++;
            }
        }
        return result;

    }
}
