package recursion;

public class Sum {
    public static void main(String[] args) {
        int ans=sum(5);
        System.out.println(ans);

    }

    static int sum(int n){
        if(n<=1) //f0 da 1 döndürüyor f1 de 1 döndürüyor bundan dolayı n==1 yazmak yerine bunu yazarız ve negatif numaraları engellemiş oluruz.
            return 1;

        return n+sum(n-1);



    }
}
