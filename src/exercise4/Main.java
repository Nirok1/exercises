package exercise4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner inScanner = new Scanner(System.in);
        GraphicDigit graphicDigit = new GraphicDigit(inScanner.nextInt());
        graphicDigit.outputDigit();
    }
}
