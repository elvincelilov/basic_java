package az.java_lesson.exercise;

import java.util.Scanner;

public class PlusInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eded daxil edin:");
        int a = sc.nextInt();
        topla(a);
    }
    public static void topla(int a){
        String eded = String.valueOf(a);
        int cem = 0;
        for (int i = 0; i < eded.length(); i++) {
            int h =Character.getNumericValue(eded.charAt(i));
            cem = cem +h;
        }
        System.out.println(cem);
    }
}
