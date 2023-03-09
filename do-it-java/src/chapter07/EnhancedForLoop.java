package chapter07;

public class EnhancedForLoop {
    public static void main(String[] args) {
        String[] strArray = {"Java", "Android", "C", "JavaScript", "Python"};

        for(String language : strArray) {
            System.out.println(language);
        }
    }
}
