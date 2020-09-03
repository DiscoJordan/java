package part3.string_class.task8;

import java.util.Scanner;

public class Task8 {
    public static String longer(String str){
        StringBuilder sb = new StringBuilder();
        int count = 0;
        int max = 0;
        int position = 0;
        for(int i = 0; i < str.length(); i++) {
          if(str.charAt(i) != ' '){
              count ++;
             if ( count > max){
                 max = count;
                 position = i;
             }
            }
          else{
              count = 0;
            }
        }
        for(int i = position - max + 1; i <= position; i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("enter string");
        String str = scaner.nextLine();
        System.out.println(longer(str));
    }
}
