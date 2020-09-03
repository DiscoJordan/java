package part3.char_array.task5;

public class Task5 {
    public static int countSpaces(String string) {
        int counter = 0;
        char newString[] = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            newString[i] = string.charAt(i);
        }
        System.out.println(string.length());
        int i = 0;
        if (newString.length > 0) {
            while (i < newString.length && newString[i] == ' ') {
                counter++;
                i++;
            }
        }


        if (newString.length > 1) {
            for (; i < newString.length - 1; i++) {
                if (newString[i] == ' ' && newString[i + 1] == ' ') {
                    counter++;
                }
            }

            if (newString[newString.length - 1] == ' ' && i < newString.length) {
                counter++;
            }

        }
        return counter;
    }

    public static String deleteSpaces(String string, int numberOfSpaces) {
        if (string.length() != numberOfSpaces) {
            char newString[] = new char[string.length() - numberOfSpaces];
            int j = 0;
            int i = 0;
            while (string.charAt(i) == ' ') {
                i++;
            }
            for (; i < string.length() - 1; i++) {
                if (string.charAt(i) == ' ' && string.charAt(i + 1) == ' ') {
                    continue;
                } else {
                    newString[j] = string.charAt(i);
                    j++;
                }
            }

            if (string.charAt(string.length() - 1) != ' ' && string.length() > 1) {
                newString[j] = string.charAt(string.length() - 1);
            }

            return new String(newString);
        } else {
            return "";
        }
    }

    public static void main(String[] args) {
        String s = " c  a  s  e ";
        System.out.println(countSpaces(s));
        s = deleteSpaces(s, countSpaces(s));
        System.out.println(s);
    }
}