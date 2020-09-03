package part3.char_array.task4;

public class Task4 {
    public static int countofdigits(String string) {
        int counter = 0;
        int newString[] = new int[string.length()];
        for (int i = 0; i < string.length(); i++) {
            newString[i] = string.charAt(i);
        }
        for (int i = 0; i < string.length(); i++) {
            if (newString[i] >= 48 &&  newString[i] <= 57) {
                counter ++;
                while(++i < string.length() && newString[i] >= 48 &&  newString[i] <= 57);

            }
        }
        return counter;
    }
    public static void main(String[] args) {
        String s = "1 2 3 456 qwerty6ui45464 475 4gr";
        System.out.println(countofdigits(s));
    }
}
