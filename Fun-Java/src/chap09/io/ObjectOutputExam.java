package chap09.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectOutputExam {
    public static void main(String[] args) throws Exception {
        User user1 = new User("uni@example.com", "신재윤", 1996);
        User user2 = new User("zzzzz@example.com", "홍길동", 1986);
        User user3 = new User("asdfasdf@example.com", "둘리", 1972);
        ArrayList<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("/Users/jaeyoon/Desktop/userlist.dat"));
        out.writeObject(list);
        out.close();
    }
}
