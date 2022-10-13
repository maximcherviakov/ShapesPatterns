public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        ShapeCache.loadCache();

        circle = ShapeCache.getShape("1");
        rectangle = ShapeCache.getShape("2");
        square = ShapeCache.getShape("3");
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
