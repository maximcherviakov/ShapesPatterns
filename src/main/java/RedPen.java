public class RedPen implements DrawingAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle {\n\tcolor: red;\n\tradius: " + radius + ";\n\tx: " + x + ";\n\ty: " + y + "\n]\n");
    }
}
