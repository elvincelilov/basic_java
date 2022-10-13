package az.java_lesson.exercise;

import java.util.Scanner;

public class MethodEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eded daxil edin");
        int a = sc.nextInt();
        findMiddle(a);
    }

    public static void findMiddle(int a) {
        String eded = String.valueOf(a);
        int uzunluq = eded.length();
        if (uzunluq % 2 == 1) {
            System.out.println(a + " ededinin ortasindaki reqem " + eded.charAt(uzunluq / 2));
        } else
            System.out.println(" ERROR !!! -->  Daxil etdiyiniz ededde orta reqem yoxdur");
    }
}
