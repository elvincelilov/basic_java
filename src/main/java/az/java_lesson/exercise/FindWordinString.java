package az.java_lesson.exercise;

import java.util.Scanner;

public class FindWordinString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("String daxil edin : ");
        String input = sc.nextLine();
        countWordsUsingSplit(input);
//        findword(word);
    }

//    public static void findword(String word) {
//        String[] words = word.split(" ");
//        System.out.println(words.length);
//    }

    public static void countWordsUsingSplit(String input) {

        String[] words = input.split("\\s+");
        System.out.println(words.length);
    }

}
