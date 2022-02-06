package exercise4;

import java.util.ArrayList;

public class GraphicDigit {
    private static ArrayList<String[]> digits = new ArrayList();
    private String[] graphic = {"", "", "", "", "", "", ""};
    private void digitsInitialization(){
        digits.add(new String[]{
                " ** ",
                "*  *",
                "*  *",
                "*  *",
                "*  *",
                "*  *",
                " ** "
        });
        digits.add(new String[]{
                "  * ",
                " ** ",
                "* * ",
                "  * ",
                "  * ",
                "  * ",
                "  * "
        });
        digits.add(new String[]{
                " ** ",
                "*  *",
                "   *",
                "   *",
                " ** ",
                "*   ",
                "****"
        });
        digits.add(new String[]{
                " ** ",
                "*  *",
                "   *",
                " ** ",
                "   *",
                "*  *",
                " ** "
        });
        digits.add(new String[]{
                "*  *",
                "*  *",
                "*  *",
                "****",
                "   *",
                "   *",
                "   *"
        });
        digits.add(new String[]{
                "****",
                "*   ",
                "*   ",
                " ** ",
                "   *",
                "*  *",
                " ** "
        });
        digits.add(new String[]{
                " ** ",
                "*  *",
                "*   ",
                "*** ",
                "*  *",
                "*  *",
                " ** "
        });
        digits.add(new String[]{
                "****",
                "   *",
                "  * ",
                "  * ",
                " *  ",
                " *  ",
                "*   "
        });
        digits.add(new String[]{
                " ** ",
                "*  *",
                "*  *",
                " ** ",
                "*  *",
                "*  *",
                " ** "
        });
        digits.add(new String[]{
                " ** ",
                "*  *",
                "*  *",
                " ***",
                "   *",
                "*  *",
                " ** "
        });
    }


    public GraphicDigit(int number){
        digitsInitialization();
        int numberCopy = number;
        int max = -1;
        while (numberCopy > 0){
            if (max< numberCopy%10){
                max = numberCopy%10;
            }
            numberCopy = numberCopy/10;
        }
        numberCopy = number;
        while (numberCopy > 0){
            int digit = numberCopy % 10;
            numberCopy = numberCopy / 10;
            if (digit == max) {
                for (int i = 0; i < graphic.length; i++) {
                    graphic[i] = digits.get(digit)[i].replace("*", "" + max) + " " + graphic[i];
                }
            }
            else{
                for (int i = 0; i < graphic.length; i++) {
                    graphic[i] = digits.get(digit)[i] + " " + graphic[i];
                }
            }
        }
    }


    public void outputDigit(){
        for (int i = 0; i<graphic.length; i++){
            System.out.println(graphic[i]);
        }
    }
}
