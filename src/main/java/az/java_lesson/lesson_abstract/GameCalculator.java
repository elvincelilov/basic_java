package az.java_lesson.lesson_abstract;

public abstract  class GameCalculator {
   public abstract void    hesabla(); // abstract methodlar body hissesi teleb etmir override olundugu yerde doldurmag lazimdir.
    public  final void finish(){
        System.out.println("Oyun bitdi!");
    }
}
