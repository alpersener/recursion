package recursion.Array;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr={5,6,7,8,9,1,2,3};
        System.out.println(search(arr,5,0,arr.length-1));

    }

    static int search(int[] arr,int target,int low,int high){
        if(low>high)
            return -1;

        int mid=low+(high-low)/2;
        if (arr[mid]==target) {
            return mid;
        }
        if (arr[low] < arr[mid]) {
            if(target>=arr[low] && target<=arr[mid])
                return search(arr,target,low,mid-1);
            else
                return search(arr,target,mid+1,high);

        }

        if(target>=arr[mid] && target<=arr[high]){
            return search(arr,target,mid+1,high);
        }
        else {
            return search(arr,target,low,mid-1);
        }





    }
}
