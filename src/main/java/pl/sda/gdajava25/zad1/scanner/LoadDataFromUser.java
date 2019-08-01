package pl.sda.gdajava25.zad1.scanner;

import lombok.AllArgsConstructor;
import pl.sda.gdajava25.zad1.counter.CountingWord;

import java.util.Scanner;

@AllArgsConstructor
public class LoadDataFromUser {
    private final static Scanner SCANNER = new Scanner(System.in);
    private CountingWord countingWord;


    public void getStarted() {
        String comend = null;
        do {
            comend = SCANNER.nextLine();
            if (noQuitOrScore(comend))
                splitWord(comend);
            if (comend.equalsIgnoreCase("score")) {
                countingWord.pritnScore();
            }


        } while (!comend.equalsIgnoreCase("quit"));
    }

    private boolean noQuitOrScore(String comend) {
        return !comend.equalsIgnoreCase("quit") && !comend.equalsIgnoreCase("score");
    }

    private void splitWord(String comend) {
        String[] strings = comend.split(" ");
        for (String s : strings) {
            countingWord.add(s);
        }
    }


}
