import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(giveChange(230)));
    }

    public static int[] giveChange(int number){
        int numOfHundreds = 0;
        int noOfFifty = 0;
        int noOfTwenty = 0;

        if (number >= 100){
            numOfHundreds = number / 100;
            number = number % 100;
            if (number == 30 || number == 10){
                numOfHundreds --;
                number += 100;
            }
        }
        while (number >= 50 && (number - 50) % 20 == 0){
            number -= 50;
            noOfFifty += 1;
        }
        noOfTwenty = number / 20;

        return new int[]{numOfHundreds, noOfFifty, noOfTwenty};
    }
}
