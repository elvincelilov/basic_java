package az.java_lesson.lesson_objects;

public class Main {
    public static void main(String[] args) {
        User u = new User(21,"Elvin");
        System.out.println(u.getA()+" "+ u.getS());
        User n = new User();
        n.setA(21);
        n.setS("Ilkin");
        System.out.println(n.getA()+" "+ n.getS());

    }
}
