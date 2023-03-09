package chapter07.ex;

public class DogTest {
    public static void main(String[] args) {
        Dog[] dogArr = new Dog[5];

        dogArr[0] = new Dog("뽀뇨", "말티즈");
        dogArr[1] = new Dog("루비", "푸들");
        dogArr[2] = new Dog("복돌이", "포메라니안");
        dogArr[3] = new Dog("복뚱이", "말티즈");
        dogArr[4] = new Dog("와와", "치와와");

        System.out.println("=== 기본 for문 ===");
        for (int i = 0; i < dogArr.length; i++) {
            System.out.println(dogArr[i].showDogInfo());
        }

        System.out.println();
        System.out.println("=== 향상된 for문 ===");
        for (Dog dog : dogArr) {
            System.out.println(dog.showDogInfo());
        }
    }
}
