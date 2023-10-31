package recursion.Array;

import java.util.ArrayList;

public class LinearSearchRecursion {
    public static void main(String[] args) {
        int[] arr={42,2,5,87,15,87};
        int[] arr2={1,2,3,4,4,8};
        System.out.println(find(arr,15,0));
        System.out.println(findIndex(arr,15,0));
        findAllIndex(arr,87,0);
        System.out.println(list);
        System.out.println(findAllIndex2(arr2,4,0,new ArrayList<>()));

    }

    static boolean find(int[] arr,int target,int index){
        if(index==arr.length)
            return false;
        return arr[index]==target || find(arr,target,index+1);
    }

    static int findIndex(int[] arr,int target,int index){
        if(index==arr.length)
            return -1;
        if (arr[index]==target) {
            return index;
        }
        else{
            return findIndex(arr,target,index+1);
        }
    }

    static ArrayList<Integer> list=new ArrayList<>();
    static void findAllIndex(int[] arr,int target,int index){
        if(index==arr.length) {
            return;
        }
        if (arr[index]==target) {
            list.add(index);
        }
        findAllIndex(arr,target,index+1);
    }

    static ArrayList findAllIndex2(int[] arr,int target,int index,ArrayList<Integer> list2){
        if(index==arr.length){
            return list2;
        }
        if(arr[index]==target)
            list2.add(index);
        return findAllIndex2(arr,target,index+1,list2);
    }


}
