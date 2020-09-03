package part3.char_array.task2;

public class Task2 {
    public static int countword(String string) {
        int counter = 0;
        char newString[] = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            newString[i] = string.charAt(i);

        }
        System.out.println(string.length());
        for (int i = 0; i < string.length()-3; i++) {
            if (newString[i] == 'w' && newString[i + 1] == 'o' && newString[i + 2] == 'r' && newString[i + 3] == 'd') {
                counter += 2;
            }
        }
        System.out.println(counter);
        return counter;

    }
    public static String WordToLetter(String string, int numberOfWord) {

        char newString[] = new char[string.length() + numberOfWord];
        int j = 0;

        for (int i = 0; i < string.length(); i++) {
            if( string.charAt(i) == 'w' &&  string.charAt(i + 1) == 'o'  &&  string.charAt(i + 2) == 'r'  &&  string.charAt(i+3) == 'd' ) {

                newString[j] = 'l';
                newString[j + 1] = 'e';
                newString[j + 2] = 't';
                newString[j + 3] = 't';
                newString[j + 4] = 'e';
                newString[j + 5] = 'r';
                j += 5;
                i += 3;

            }
            else {
                newString[j] = string.charAt(i);
            }
            j++;
        }
        return new String(newString);
    }
    public static void main(String[] args) {
        String s = "we have word in Word but we dont have word in letter";
        s = WordToLetter(s, countword(s));
        System.out.println(s);
    }
}
