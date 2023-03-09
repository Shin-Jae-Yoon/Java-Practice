package chapter06.chapter06_ex.q6;

public class Company {
    private Company () {};

    private static Company instance = new Company();

    public static Company getInstance() {
        if (instance == null) {
            instance = new Company();
        }
        return instance;
    }

    public Card createCard() {
        return new Card();
    }
}
