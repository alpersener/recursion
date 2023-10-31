package recursion;

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
