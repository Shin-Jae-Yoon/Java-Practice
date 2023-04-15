package chap09.decorator;

public class GreenShapeDecorator extends ShapeDecorator {
    public GreenShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        setGreenBorder(decoratedShape);
    }

    private void setGreenBorder(Shape decoratedShape) {
        System.out.println("Green ============== Start");
        decoratedShape.draw();
        System.out.println("Green ============== End");
    }
}
