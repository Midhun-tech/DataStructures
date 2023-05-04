package Array.Recurssion;

import java.util.ArrayList;

public class arrays {

    public static void main(String args[])
    {
        int arr[] = {1,2,3,3,4};
        System.out.println(recurssion(arr,3,0));
    }

    static ArrayList<Integer> recurssion(int[] arr, int target , int index)
    {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length-1){
            return list ;
        }
        if(arr[index]== target){
            list.add(index);
        }
        ArrayList<Integer>arrayList= recurssion(arr, target , index+1);
        list.addAll(arrayList);
        return list;
    }

}
