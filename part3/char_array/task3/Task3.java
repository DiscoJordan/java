package part3.char_array.task3;

public class Task3 {
    public static int countofdigits(String string) {
        int counter = 0;
        int newString[] = new int[string.length()];
        for (int i = 0; i < string.length(); i++) {
            newString[i] = string.charAt(i);
        }
        for (int i = 0; i < string.length(); i++) {
            if (newString[i] >= 48 &&  newString[i] <= 57) {
                counter ++;
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        String s = "1 2 3 456 qwerty6ui";
        System.out.println(countofdigits(s));
    }
}
