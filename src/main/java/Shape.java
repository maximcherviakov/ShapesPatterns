public abstract class Shape implements Cloneable {
    private String id;
    protected String type;
    protected DrawingAPI drawingAPI;

    protected Shape(DrawingAPI drawingAPI){
        this.drawingAPI = drawingAPI;
    }

    protected Shape() {
    }

    abstract void draw();

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setId(String id) {
        this.id = id;
    }

    protected Object clone() {
        Object clone = null;

        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}
