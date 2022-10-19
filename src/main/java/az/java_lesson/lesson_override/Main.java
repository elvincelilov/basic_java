package az.java_lesson.lesson_override;

public class Main {
    public static void main(String[] args) {
        Bmw b = new Bmw();
        b.drive();
        Merc m = new Merc();
        Car c=m;
        c.drive();


    }
}
