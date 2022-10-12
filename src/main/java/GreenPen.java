public class GreenPen implements DrawingAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle {\n\tcolor: green;\n\tradius: " + radius + ";\n\tx: " + x + ";\n\ty: " + y + "\n]\n");
    }
}
