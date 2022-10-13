package az.java_lesson.lesson_objects;

public class User {
    private   int a;
    private String s;
    private   static double d ;

    public User(){

    }

    public User(int a, String s) {
        this.a = a;
        this.s = s;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public static double getD() {
        return d;
    }

    public static void setD(double d) {
        User.d = d;
    }
}

