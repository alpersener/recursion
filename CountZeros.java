package recursion;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println(count(3021050));

    }


    static int count(int n){
        return helper(n,0); //c 0 dan başladığı için parametre olarak 0 verdik.
    }
    private static int helper(int n,int c){
        if(n==0) //yani tüm sayıların sayımı bitti en sonda elimizde 0 kaldı ise c'yi döndür örneğin ensonda 3 kaldı mod 10 ile orası 0 olacak mantıken
            return c;
        int rem=n%10;
        if(rem==0) //eğer 0 ise count arttır ve sayıyı 10a bölerek cıkart
            return helper(n/10,c+1);
        return helper(n/10,c); //cıkarılan sayı 0 degilse c degeri oldugu gibi kalacak.


    }
}
