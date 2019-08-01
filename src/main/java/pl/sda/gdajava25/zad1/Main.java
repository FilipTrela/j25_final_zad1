package pl.sda.gdajava25.zad1;

import pl.sda.gdajava25.zad1.counter.CountingWord;
import pl.sda.gdajava25.zad1.scanner.LoadDataFromUser;

/**
 * Stwórz aplikację która czyta tekst od użytkownika i "notuje" ile
 * razy użytkownik wpisał w aplikacji pewne słowo. Użytkownik może bez końca wpisywać zdania,
 * a po użyciu komendy "wynik" aplikacja powinna wypisać wszystkie słowa i liczbę ich wystąpień.
 * Komenda "quit" zamyka aplikację. Przykład:
 * <p>
 * cośtam sobie wpisuje
 * i liczę że cośtam będzie kilka razy wychwycone
 * więc teraz na znak inny niż cośtam
 * wynik
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Witam w aplikacji zliczającej wystąpienie słów [quit,score]");
        CountingWord countingWord = new CountingWord();
        LoadDataFromUser loadDataFromUser = new LoadDataFromUser(countingWord);
        loadDataFromUser.getStarted();


    }
}
