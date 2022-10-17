package az.java_lesson.exercise;

public class PentogonalNumber {
    public static void main(String[] args) {
        int count = 1;
        for(int i = 1; i <= 50; i++){
            getPentagonalNumber(i);
        }
    }
    public static void getPentagonalNumber(int i) {
        System.out.println((i * (3 * i - 1))/2);
    }
}
