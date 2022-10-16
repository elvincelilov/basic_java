package az.java_lesson.exercise;

import java.util.Scanner;

public class FindWowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        findWowel(word);
    }

    public static void findWowel(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u' || word.charAt(i) == 'e' || word.charAt(i) == 'ə' || word.charAt(i) == 'ö' || word.charAt(i) == 'ü' || word.charAt(i) == 'ı') {
                count++;
            }
        }
        System.out.println(count);
    }
}
