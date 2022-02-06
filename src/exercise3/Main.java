package exercise3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<Vowel> vowels = new ArrayList<>();
        String[] inputString;
        Scanner inScanner = new Scanner(System.in);
        inputString = inScanner.nextLine().split(" ");
        for (int i=0; i < inputString.length; i++){
            vowels.add(new Vowel(inputString[i]));
        }
        vowels.sort(Vowel::compareTo);
        Collections.reverse(vowels);
        for (int i=0; i < vowels.size(); i++){
            vowels.get(i).capitalVowel();
        }
        for (int i=0; i < vowels.size(); i++){
            System.out.println(vowels.get(i));
        }
    }

}
