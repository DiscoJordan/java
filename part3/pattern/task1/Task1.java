package part3.pattern.task1;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    private static String s = "There are different kinds of" +
            " animals on our planet, and all of them are very important for" +
            " it. For example, everybody knows that the sharks are dangerous" +
            " for people, but they are useful for cleaning seawater.\u2029\n" +
            "There are two types of animals: domestic (or pets)" +
            " and wild. People keep pets in their homes. And some wild" +
            " animals are very dangerous Domestic animals live next to" +
            " people, whereas wild animals’ “homes” are forests, oceans" +
            " and so on.\u2029\n";

    public static String sortParagraphs(String s) {
        List<String> paragraphs = getParagraphs(s);

        paragraphs.sort((a, b) -> getSentences(a).size() - getSentences(b).size());

        return paragraphsToText(paragraphs);
    }

    public static String sortWords(String s) {
        List<String> sentences = getSentences(s);
        List<String> words;

        for (int i = 0; i < sentences.size(); i++) {
            words = getWords(sentences.get(i));
            words.sort((a, b) -> a.length() - b.length());

            sentences.set(i, wordsToSentence(words,
                    getPunctuationMark(sentences.get(i))));
        }

        return sentencesToParagraph(sentences);
    }

    public static String getPunctuationMark(String sentence) {
        Pattern p = Pattern.compile("[.!?]+");
        Matcher matcher = p.matcher(s);

        matcher.find();

        return matcher.group();
    }

    public static String wordsToSentence(List<String> words, String punctuationMark) {
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            sb.append(String.format(" %s", word));
        }

        sb.append(punctuationMark);

        return sb.toString();
    }

    public static String paragraphsToText(List<String> paragraphs) {
        StringBuilder sb = new StringBuilder();

        if (paragraphs.size() > 0 && paragraphs.get(0).contains("\u2029")) {
            for (String paragraph : paragraphs) {
                sb.append(String.format("%s", paragraph));
            }
        } else {
            for (String paragraph : paragraphs) {
                sb.append(String.format("%s\u2029\n", paragraph));
            }
        }


        return sb.toString();
    }

    public static String sentencesToParagraph(List<String> sentences) {
        StringBuilder sb = new StringBuilder();

        for (String sentence : sentences) {
            sb.append(String.format("%s", sentence));
        }

        return sb.toString();
    }

    public static List<String> getParagraphs(String s) {
        Pattern paragraphPattern = Pattern.compile(".+?\\u2029\n");
        return getMatchesFromPattern(s, paragraphPattern);
    }

    public static List<String> getSentences(String s) {
        Pattern sentencePattern = Pattern.compile(".+?[.?!]+");
        return getMatchesFromPattern(s, sentencePattern);
    }

    public static List<String> getWords(String s) {
        Pattern wordPattern = Pattern.compile("\\b\\w+\\b");
        return getMatchesFromPattern(s, wordPattern);
    }

    public static List<String> getMatchesFromPattern(String s, Pattern p) {
        Matcher matcher = p.matcher(s);
        StringBuilder sb = new StringBuilder();
        List<String> matches = new ArrayList<String>();

        while (matcher.find()) {
            matches.add(matcher.group());
        }

        return matches;
    }

    public static String sortLexemes(String s, char c) {
        List<String> sentences = getSentences(s);
        List<String> words;

        for (int i = 0; i <sentences.size(); i++) {
            words = getWords(sentences.get(i));
            words.sort((a, b) -> countCharacterOccurrence(b, c)
                    - countCharacterOccurrence(a, c));

            sentences.set(i, wordsToSentence(words,
                    getPunctuationMark(sentences.get(i))));
        }

        return sentencesToParagraph(sentences);
    }

    public static int countCharacterOccurrence(String s, char c) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }

        return count;
    }

    public static void process() {
        Scanner scanner = new Scanner(System.in);
        int commandResult = 1;

        while (commandResult != 0) {
            showMenu();
            commandResult = executeCommand(scanner.nextInt());
        }
    }

    public static void showMenu() {
        System.out.println("the text: \n");
        System.out.println(s);
        System.out.println("press 0 to exit\n" +
                "press 1 to sort paragraphs by number of sentences\n" +
                "press 2 to sort words in sentences by length\n" +
                "press 3 to sort lexemes by character\n");
    }

    public static int executeCommand(int command) {
        Scanner scanner = new Scanner(System.in);

        final int SORT_PARAGRAPHS = 1;
        final int SORT_WORDS = 2;
        final int SORT_LEXEMES = 3;
        switch (command){
            case SORT_PARAGRAPHS:
                s = sortParagraphs(s);
                break;
            case SORT_WORDS:
                s = sortWords(s);
                break;
            case SORT_LEXEMES:
                System.out.print("Input character: ");
                String character = scanner.nextLine();
                s = sortLexemes(s, character.charAt(0));
                break;
            default:
                break;
        }
        return command;
    }

    public static void main(String[] args) {
        process();
    }
}