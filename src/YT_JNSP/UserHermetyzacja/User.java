package YT_JNSP.UserHermetyzacja;

public class User {
    // Deklaracja zmiennych typu 'private'. Dostep tylko z klasy 'User' lub poprzez getter() lub setter()
    private String name;
    private int age;

    // ------ Konstruktor ------
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // ------ Getters ------
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    // legalBuy() method logic
    public boolean legalBuy() {
        if (age>=18) {
            System.out.println(getName() + " jest pelnoletni. Legalna sprzedaz.");
            return true;
        } else {
            System.out.println(getName() + " jest NIEPELNOLETNI/A! Ma tylko " + getAge());
            return false;
        }
    }
}
