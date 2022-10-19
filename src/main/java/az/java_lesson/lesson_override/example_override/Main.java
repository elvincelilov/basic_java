package az.java_lesson.lesson_override.example_override;

public class Main {
    public static void main(String[] args) {
        BankKrediManager [] kreditIdaresi = new BankKrediManager[]{
                new OgrenciKrediManager() , new OgretmenKrediManager() , new TakimKrediManager()
        };

        for (BankKrediManager kredimanager: kreditIdaresi
             ) {
            System.out.println(kredimanager.hesapla(1000));
        }
    }
}
