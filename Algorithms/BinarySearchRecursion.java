package recursion;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,55,66,78};
        int target=78;
        System.out.println(search(arr,target,0,arr.length-1));




    }
    /*
     arguments'lere ne koyarsak koyalım diğer func cagrısında cagıralacak her turlu
     yani start ve end'i parametrede vermek gerekiyor çünkü array'i 2ye bölen değerler aslında start ve end eğer bunları
     vermezsek hiçbir anlamı kalmıyor recursionun.
     middle değeri ise body'ye yazılmalı çünkü bu middle değeri diğer function'lar için önemli mi? değil bundan dolayı
     middle değeri function'un body'sine yazılmalı
    */

    static int search(int [] arr,int target,int low,int high){
        if(low>high)
            return -1;

        int middle=low+(high-low)/2;

        if(arr[middle]==target){
            return middle;
        }
        //sol tarafa kaydıysa
        if(target<arr[middle]){
            //high=middle-1;
            //eğer recursion kullanılırsa return yaz
            return search(arr,target,low,middle-1);
        }
        //sağ tarafa kaydıysa
        //eğer recursion kullanılırsa return yaz
        return search(arr,target,middle+1,high);





    }
}
