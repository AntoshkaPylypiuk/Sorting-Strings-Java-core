import java.util.*;

public class TextProcessor {
    List<String> words = new ArrayList<>();
    Scanner s = new Scanner(System.in);
    public void chooseWordsForArray() {
        System.out.println("Choose words for your set or type \"stop\" to stop choosing");

        while (true) {
            System.out.println("Type word or \"stop\"");
            String input = s.next();

            if (input.equalsIgnoreCase("stop")) {
                break;
            }

            words.add(input);
        }
    }
    public void chooseOptions() {
        System.out.print(Const.OPERATION_PROMPT);
        char operation = s.next().charAt(0);

        switch (operation) {
            case '=' -> showWords();
            case '/' -> countWords();
            case '%' -> countElementsOfTheWord();
            case '#' -> reverseWord();
            case '+' -> changeToUpperCaseWord();
            case '-' -> changeToLowerCaseWord();

            default -> System.out.println("Mistake, there are no such options");
        }
    }
    public void showWords(){
        System.out.println("Your words are : " + words);
    }
    public void countWords(){
        System.out.println("Numbers of words are : " + words.size());
    }
    public void countElementsOfTheWord(){
        List<Integer> elementsOfTheWord = new ArrayList<>();

        for (String word : words){
            elementsOfTheWord.add(word.length());
        }

        System.out.println("Numbers of elements in your array are : " + elementsOfTheWord);
    }
    public void reverseWord(){
        List<String> originalWords = new ArrayList<>(words);

        StringBuilder reversedStrings = new StringBuilder(originalWords.toString()).reverse();
        String result = String.join(" ",reversedStrings);
        System.out.println("Your word reversed : " + result);
    }
    public void changeToUpperCaseWord() {
        String result = String.join(" ", words).toUpperCase(Locale.ENGLISH);
        System.out.println("Your text with upper case: " + result);
    }

    public void changeToLowerCaseWord() {
        String result = String.join(" ", words).toLowerCase(Locale.ENGLISH);
        System.out.println("Your text with lower case: " + result);
    }
}