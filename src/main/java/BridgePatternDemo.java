public class BridgePatternDemo {
    public static void main(String[] args) {
        Circle greenCircle = new Circle(0, 0, 60, new GreenPen());
        Circle redCircle = new Circle(10, 10, 300, new RedPen());

        greenCircle.draw();
        redCircle.draw();
    }
}
