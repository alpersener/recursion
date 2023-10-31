package recursion;

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
