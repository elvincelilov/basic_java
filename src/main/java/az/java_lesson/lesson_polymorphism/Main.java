package az.java_lesson.lesson_polymorphism;

public class Main {

    public static void main(String[] args) {
        Robben r = new Robben();
        Bird b=r;
        Robben rr = (Robben) b;

    }
}
