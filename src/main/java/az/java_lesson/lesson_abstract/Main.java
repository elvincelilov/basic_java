package az.java_lesson.lesson_abstract;

public class Main {
    public static void main(String[] args) {
        ManGameCalculator manGameCalculator = new ManGameCalculator();
        manGameCalculator.hesabla();
        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.hesabla();
    }
}
