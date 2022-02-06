package exercise2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class primaFactorization {
    public static boolean isPrimeNumber(int number){
        for (int i = 2; i *i <= number; i++){
            if (number % i == 0 ){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner inScanner  = new Scanner(System.in);
        try {
            int number = inScanner.nextInt();
            int i = 2;
            while (number > 1) {
                if ((number % i == 0) && (isPrimeNumber(i))) {
                    System.out.println(i);
                    number = number / i;
                } else {
                    i++;
                }
            }
        }catch (InputMismatchException e){
            System.out.println(e);
        }
    }
}
