Recursion
==========
![photo1](https://github.com/alpersener/recursion/blob/main/photos/photo1.png)

*   Fonksiyonun return ettiği değerler fonksiyonun çağırıldığı yerde tutulur
```
    public class NumbersExampleRecursion {
        public static void main(String[] args) {
            //write a function that takes in a number and prints it
            //print 5 numbers->1 2 3 4 5
            print(1);
    
        }
        static void print(int n){
            //BASE CONDITION(recursion'un durması için öbür türlü sonsuza kadar devam eder->stackoverflow error)
            if(n==6)
                return;
            System.out.println(n);
            print(n+1);
    
        }
    
    }

```

Recursion Kullanımı
===================

Complex ya da büyük problemleri basit bir yolla çözmek için recursion kullanılır.

Recursion solution’ları iterasyonlara çevirebiliriz ya da tam tersi

**Complex problemleri ilk önce recursion ile çözüp ardından iterasyonlara(loop gibi) çevirip optimize bir cevap elde etmek için kullanılır.Çünkü direkt olarak iterasyonlar ile çözmek zordur**

Space complexity constant değildir çünkü hfer bir fonksiyon çağırıldığında stack’de yer tutacaktır bu nedenle space complexity O(n)’dir.

Visualizing Recursion(Recursion Tree)
=====================================

[![](Recurision%208ffc8ebfcaf64de99b1df54a8738b04d/Adsz%201.png)](Recurision%208ffc8ebfcaf64de99b1df54a8738b04d/Adsz%201.png)

Eğer bir problem daha küçük parçalara ayrılıp bölünebiliyorsa orada recursion kullanabiliriz

**Örneğin fibonacci sayıları;**

→5.fibonacci sayısı nasıl bulunur?

F(5)=f(4)+f(3)

→F(4)=f(3)-f(2)

→F(3)=f(f2)-f(1)

→F(2)=f(1)+f(0)

→F(1)=f(0)+f(-1) şeklinde devam eder.

Bu nedenle fibonacci sayılarında recursion kullanılabilir(mergesort,quicksort gibi sorting algoritmalarında da kullanılacak)

![photo2](https://github.com/alpersener/recursion/blob/main/photos/photo2.png)
![sd](https://github.com/alpersener/recursion/assets/69325145/95ddc04a-dfc9-495d-a6e1-1ebfa6c24b91)


Recursion yaklaşım
==================

1.  Problem küçük parçalara bölünebilir mi ?

2.  Recurence relation’u(burada mesela fibo(n)=fibo(n-1)+fibo(n-2) yaz gerekliyse

3.  Recursive tree’yi yaz

4.  Tree ile alakalı şeyler
    
    1.  Function’ların flow’una bak
    
    2.  left tree ya da right tree’ye dikkat et ilk önce hangisi çalışacak diye(kodda ilk önce sol tarafı yazdığımız için sol taraf başlıyor n-1 yani eğer n-2 yazsaydık ilk başta sağ taraftaki başlayacaktı)
    
    3.  Tree’yi çiz ,kalem ile kağıtla dene debug yaparak çözmeye çalış kontrol et

5.  Her adımda hangi value’ların döndüğüne bak

Binary Search Recursion
=======================
```

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
```

SORULAR:
========

1)N-to-1 ve 1-to-N
-------------------------

![nto1](https://github.com/alpersener/recursion/blob/main/photos/nto1.png)
```
    
    public class NTo1 {
        public static void main(String[] args) {
            fun(5);
            System.out.println("\n------");
            fun2(5);
    
    
        }
    
        static void fun(int n){
            if(n==0)
                return;
            System.out.print(n);
            fun(n-1);
        }
    
        static void fun2(int n){
            if(n==0)
                return;
            fun2(n-1);
            System.out.print(n);
    
        }
    }
```

2)Factorial
-----------

![factorial](https://github.com/alpersener/recursion/blob/main/photos/factorial.png)

```
    public class Factorial {
        public static void main(String[] args) {
            int ans=fact(7);
            System.out.println(ans);
    
        }
    
        static int fact(int n){
            if(n<=1) //f0 da 1 döndürüyor f1 de 1 döndürüyor bundan dolayı n==1 yazmak yerine bunu yazarız ve negatif numaraları engellemiş oluruz.
                return 1;
    
            return n*fact(n-1);
    
        }
    }
```

3)SUM
-----

1’den n’e kadar giden sayıların toplamı(n\*n+1/2) mantığının aynısı recursion ile.

![sum](https://github.com/alpersener/recursion/blob/main/photos/sum.png)

```
    public class Sum {
        public static void main(String[] args) {
            int ans=sum(10);
            System.out.println(ans);
    
        }
    
        static int sum(int n){
            if(n<=1) //f0 da 1 döndürüyor f1 de 1 döndürüyor bundan dolayı n==1 yazmak yerine bunu yazarız ve negatif numaraları engellemiş oluruz.
                return 1;
    
            return n+sum(n-1);
    
    
    
        }
    }
```

4)SUM OF DIGITS
---------------

![sumOfDigits](https://github.com/alpersener/recursion/blob/main/photos/sumofdigits.png)

```
    public class SumOfDigits {
        public static void main(String[] args) {
            int n=98542;
            int ans=sumOfDigits(n);
            System.out.println(ans);
    
    
        }
    
        static int sumOfDigits(int n){
            if(n==0)
                return 0;
            return (n%10)+sumOfDigits(n/10);
        }
    }
```

PASSING NUMBERS CONCEPT
=======================
```
    public class Concept {
        public static void main(String[] args) {
            fun(5);
        }
    
        static void fun(int n)  {
            if(n==0)
                return;
            System.out.println(n);
            //fun(n--);  -->burada sürekli n değerini(5) döndürecektir çünkü eski değeri kullanıyor n değerini azaltsa bile aşağıda geçemiyor.
            fun(--n);   //->burada n değerini azaltıp(5,4,3,2,1) öyle kullanıyor her defasında n değeri azalmış olarak devam ediyor.
    
            /*
                        n-- ile --n arasındai fark
            n-- => n değerini kullanır ve 1 azaltır (yani n değerini azaltıp eski n değerini kullanır)
            -nn => n değerini 1 azaltır ve bu azaltılmış değeri kullanır (n degerini azaltıp yeni n değerini kullanır)
            */
        }
    }
```

5)Reverse a Number
------------------

![reverseANumber](https://github.com/alpersener/recursion/blob/main/photos/reverseNumber.png)
```
    public class ReverseANumber {
        public static void main(String[] args) {
            rev(1234);
            System.out.println(sum);
        }
    
        static int sum=0;
        static void rev(int n){
            if(n==0)
                return;
            int rem=(n%10);
            sum=(sum*10)+rem;
            rev(n/10);
        }
    
    }

```

6)[**Number of Steps to Reduce a Number to Zero**](https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/)
-----------------------------------------------------------------------------------------------------------------------------
```
    public class CountStepsLeetCode {
        public static void main(String[] args) {
            System.out.println(numberOfSteps(14));
    
        }
    
       static  public int numberOfSteps(int num){
            return helper(num,0);
    
        }
    
        private static int helper(int num, int steps) {
            if(num==0) //sayı kalmadıgında steps'i döndür yani en sonda bu dönecek
                return steps;
            if(num %2 ==0) //sayı çift ise sayıyı 2 ye böl ve steps'i 1 arttır.
                return helper(num/2,steps+1);
            return helper(num-1,steps+1); //sayı 2 ye bölünmüyorsa sayıyı 1 azalt ve steps'e 1 ekle
        }
    
    
    }
```

7)Sorted Array
--------------

![sortedArray](https://github.com/alpersener/recursion/blob/main/photos/sortedArray.png)
```
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
```

8)Linear Search
---------------

![linear1](https://github.com/alpersener/recursion/blob/main/photos/linear1.png)

**Return type olarak ArrayList verirsek ve index’ini bulmak istersek aşağıdaki gibi bir görüntü olur**

![linear2](https://github.com/alpersener/recursion/blob/main/photos/linear2.png)

```
    public class LinearSearchRecursion {
        public static void main(String[] args) {
            int[] arr={42,2,5,87,15,87};
            System.out.println(find(arr,15,0));
            System.out.println(findIndex(arr,15,0));
            findAllIndex(arr,87,0);
            System.out.println(list);
            System.out.println(findAllIndex2(arr,87,0,new ArrayList<>()));
    
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
```

9)Rotated Binary Search
-----------------------

![rotatedBinarySearch](https://github.com/alpersener/recursion/blob/main/photos/rotatedbinary.png)

```
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
```
10)Triangle
-----------

![triangle](https://github.com/alpersener/recursion/blob/main/photos/triangle.png)

```   
    public class Triangle {
        public static void main(String[] args) {
            triangle(4,0);
            triangle2(4,0);
    
        }
    
        static void triangle(int r,int c){
            if (r == 0) {
                return;
            }
            if(c<r){
                System.out.print("*");
                triangle(r,c+1);
            }
            else{
                System.out.println();
                triangle(r-1,0);
            }
    
        }
    
        static void triangle2(int r,int c){
            if (r == 0) {
                return;
            }
            if(c<r){
                triangle2(r,c+1);
                System.out.print("*");
    
            }
            else{
                triangle2(r-1,0);
                System.out.println();
    
            }
    
        }
    }
```
