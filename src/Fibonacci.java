import java.util.Scanner;

/**
 * Created by devon on 11/3/2015.
 */
public class Fibonacci {
    public static int fibonacciLoop(int number){
        if(number ==1 || number == 2){
            return 1;
        }
        int fib1=1,fib2=1,fibonacci=1;
        for(int i =3;i<=number;i++){
            fibonacci = fib1+fib2;
            fib1=fib2;
            fib2=fibonacci;
        }
        return fibonacci;
    }
    public static int fibonacciRecursion(int number){
        if(number == 1 || number == 2){
            return 1;
        }
        return fibonacciRecursion(number-1) + fibonacciRecursion(number -2); //tail recursion
    }
    public static void main(String[] args){

        for(int i = 1;i<= 10; i++) {
            System.out.println("Looping Fibonacci of "+i+" is : "+fibonacciLoop(i));
            System.out.println("Recursive Fibonacci of "+i+" is: "+fibonacciRecursion(i));
        }
    }
}
