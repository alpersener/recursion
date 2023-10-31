package recursion;

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
