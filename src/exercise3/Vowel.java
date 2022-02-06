package exercise3;

public class Vowel implements Comparable<Vowel>{
    public String string;
    public int vowelCounter;
    public Vowel(String string){
        this.string = string;
        String vowels = "АЕЁИОУЫЭЮЯаеёиоуыэюя";
        int counter = 0;
        for (int i =0; i < string.length(); i++){
            if (vowels.indexOf(string.charAt(i))!= -1){
                counter++;
            }
        }
        this.vowelCounter = counter;
    }
    public void capitalVowel(){
        String vowels = "АЕЁИОУЫЭЮЯаеёиоуыэюя";
        for (int i =0; i < string.length(); i++){
            if (vowels.indexOf(string.charAt(i))!= -1){
                this.string = this.string.substring(0,i) +Character.toUpperCase(this.string.charAt(i)) + this.string.substring(i+1);
                return;
            }
        }
    }
    public int compareTo(Vowel vowels){
        if (this.vowelCounter == vowels.vowelCounter){
            return 0;
        }
        else if(this.vowelCounter < vowels.vowelCounter){
            return -1;
        }
        else {
            return 1;
        }
    }
    public String toString(){
        return this.string;
    }
}
