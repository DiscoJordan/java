package part3.char_array.task1;

public class Task1 {
    public static int countCamelCase(String string) {
        int counter = 0;
        char newString[] = new char[string.length()];

        for (int i = 0; i < string.length(); i++) {
            newString[i] = string.charAt(i);

        }

        for (char letter : newString) {
            if (letter >= 'A' && letter <= 'Z') {
                counter++;
            }
        }

        return counter;
    }

    public static String CamelToSnake(String string, int numberOfCamel) {
        char newString[] = new char[string.length() + numberOfCamel];
        int j = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) >= 'A' && string.charAt(i) <= 'Z' ) {
                if(string.charAt(i-1) == ' '){
                    newString[j] = Character.toLowerCase(string.charAt(i));
                    j++;
                }
                else{newString[j] = '_';
                j++;
                newString[j] = Character.toLowerCase(string.charAt(i));}
            } else {
                newString[j] = string.charAt(i);
            }
            j++;
        }
        return new String(newString);
    }

    public static void main(String[] args) {
        String s = "camelCase CAMELCASE";
        s = CamelToSnake(s, countCamelCase(s));
        System.out.println(s);
    }
}