package az.java_lesson.exercise;

import com.sun.source.tree.BreakTree;

import java.util.Scanner;

public class Yatirim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ilkin meblegi daxil edin:");
        double mebleg = sc.nextDouble();
        System.out.println("Faizi daxil edin:");
        double faiz = sc.nextDouble();
        System.out.println("Muddeti daxil edin:");
        int il = sc.nextInt();

        System.out.println("Netice : " + yatirim(mebleg,faiz,il));

    }

    public static double yatirim(double mebleg, double faiz, int il) {
        return mebleg*(Math.pow((1+faiz/100),il));
    }
}