package az.java_lesson.exercise;

import com.sun.source.tree.BreakTree;

import java.util.Scanner;

public class Yatirim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ilkin meblegi daxil edin:");
        int m = sc.nextInt();
        System.out.println("Faizi daxil edin:");
        int f = sc.nextInt();
        System.out.println("Muddeti daxil edin:");
        int i = sc.nextInt();

        System.out.println("Netice : " + (m*(1+100)));

    }
//    public  static  int yatirim(int mebleg , int faiz ,int il){
//        mebleg = mebleg*(1+(((il*faiz)/100)));
//        return  mebleg;
//    }


    }
