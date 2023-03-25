package chap04;

public class User {
    private String email;
    private String password;
    private String name;

    // 생성자를 하나라도 만들게 되면 기본 생성자가 자동으로 안만들어짐
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // 생성자 오버로딩(Overloading)
    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
