package recursion;

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
