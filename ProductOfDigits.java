package recursion;

public class ProductOfDigits {
    public static void main(String[] args) {
        int n=505;
        int ans=prod(n);
        System.out.println(ans);


    }

    static int prod(int n){
        if(n%10==n){    //sayının bölümü 0 olursa ans 0 olacağı için 0 cevap zaten
            return n;
        }
        return (n%10)*prod(n/10);
    }
}
