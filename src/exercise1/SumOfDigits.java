package exercise1;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args){
        Scanner inScanner = new Scanner(System.in);
        String string = inScanner.next();
        int numberSum = 0;
        for (int i = 0; i < string.length(); i++){
            if (Character.isDigit(string.charAt(i))){
                numberSum+= Character.getNumericValue(string.charAt(i));
            }
        }
        System.out.println(numberSum);
    }
}
