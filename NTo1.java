package recursion;

public class NTo1 {
    public static void main(String[] args) {
        fun(5);
        System.out.println("\n------");
        fun2(5);
        System.out.println("\n------");
        funBoth(5);


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

    static void funBoth(int n){
        if(n==0)
            return;
        System.out.print(n);
        funBoth(n-1);
        System.out.print(n);

    }
}
