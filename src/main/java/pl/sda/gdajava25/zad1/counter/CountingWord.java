package pl.sda.gdajava25.zad1.counter;


import lombok.Getter;
import lombok.Setter;
import pl.sda.gdajava25.zad1.scanner.LoadDataFromUser;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Getter
@Setter

public class CountingWord {
    private Map<String, Integer> wordCount = new HashMap<String, Integer>();
    LoadDataFromUser scanner;

    public CountingWord() {
        this.scanner = new LoadDataFromUser(this);
    }

    public void CountingWordStart() {
        scanner.getStarted();
    }


    public void add(String comend) {
        if (!checkContain(comend))
            wordCount.put(comend, 1);
        else
            plusOne(comend);

    }

    private void plusOne(String comend) {
        int count = wordCount.get(comend) + 1;
        wordCount.put(comend, count);
    }

    private boolean checkContain(String comend) {
        return wordCount.containsKey(comend);
    }

    public void pritnScore() {
        Set<String> key = wordCount.keySet();
        for (String k : key) {
            System.out.println(k + " -> " + wordCount.get(k));
        }
    }
}
