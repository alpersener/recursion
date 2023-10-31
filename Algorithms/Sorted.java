package recursion.Array;

public class Sorted {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(isSorted(arr,0));

    }

    static boolean isSorted(int[] arr,int index){
        if(index==arr.length-1){ //index array'ih son elemanındaysa
            return true;
        }
        return arr[index]<arr[index+1] && isSorted(arr,index+1);

    }
}
