package chap09.decorator;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();

        // 빨간색으로 장식할 대상이 Circle
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape greenCircle = new GreenShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nCircle of green border");
        greenCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
