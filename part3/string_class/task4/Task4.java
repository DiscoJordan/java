package part3.string_class.task4;

public class Task4 {
    public static String toCake(String word){
        String cake = String.valueOf(word.charAt(word.indexOf('т')));
        cake += String.valueOf(word.charAt(word.indexOf('о')));
        cake += String.valueOf(word.charAt(word.indexOf('р')));
        cake += String.valueOf(word.charAt(word.indexOf('т')));
        return cake;
    }

    public static void main(String[] args){
        String word = "информатика";
        System.out.println(word);
        System.out.println(toCake(word));
    }
}
