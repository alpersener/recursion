package recursion;

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
