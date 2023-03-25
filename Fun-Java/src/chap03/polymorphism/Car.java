package chap03.polymorphism;

class Car {
    private String name; // 필드는 가지는 것

    public Car() {
        System.out.println("자동차가 1대 생성됩니다.");
    }

    public Car(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("자동차 이름 : " + name);
    }

    public void run() {
        System.out.println("전륜구동으로 달린다.");
    }

    @Override
    public String toString() {
        return "자동차";
    }
}
