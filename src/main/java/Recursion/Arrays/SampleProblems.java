package Recursion.Arrays;

import java.util.ArrayList;

public class SampleProblems {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,6,5};
        // System.out.println(sorting(arr,0));

        //System.out.println(findallIndex(arr,4,0,new ArrayList<>()));

        System.out.println(findallIndexs(arr,4,0));
    }
    // find given array sorted or not
    static boolean sorting(int arr[],int index){

        if (index == arr.length-1){
            return true;
        }

        return arr[index]<arr[index+1] && sorting(arr,index+1);
    }

    //find the target element in the array or not return with the index

    static int findingIndex(int arr[],int target, int index){

        if (index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else{
           return findingIndex(arr, target , index+1);
        }
    }

    // find the target element indexes and added in the arraylist

    static ArrayList<Integer> findallIndex(int[] arr,int target, int index, ArrayList<Integer> list){

        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){

            list.add(index);
        }

        return findallIndex(arr,target,index+1, list);
    }

    // Not passing array list as an argument in order to find target element indexes

    static ArrayList<Integer> findallIndexs(int arr[] , int target, int index){

        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> arrayList = findallIndexs(arr,target ,index+1);
        list.addAll(arrayList);
        return list;

    }

}
