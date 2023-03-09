package chapter07.ex;
import java.util.ArrayList;

public class DogTestArrayList {
    public static void main(String[] args) {
        ArrayList<Dog> dogArrayList = new ArrayList<Dog>();

        dogArrayList.add(new Dog("뽀뇨", "말티즈"));
        dogArrayList.add(new Dog("루비", "푸들"));
        dogArrayList.add(new Dog("복똘이", "포메라니안"));
        dogArrayList.add(new Dog("복뚱이", "말티즈"));
        dogArrayList.add(new Dog("와와", "치와와"));

        System.out.println("=== 기본 for문 ===");
        for (int i = 0; i < dogArrayList.size(); i++) {
            System.out.println(dogArrayList.get(i).showDogInfo());
        }

        System.out.println();
        System.out.println("=== 향상된 for문 ===");
        for (Dog dog : dogArrayList) {
            System.out.println(dog.showDogInfo());
        }
    }
}
