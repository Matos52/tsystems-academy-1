package shapes;

public class Rectangle extends Shape {

    private int height;
    private int width;

    public Rectangle(char color, int height, int width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                s += super.color;
            }
            s += "\n";
        }
        return s;
    }

    @Override
    public void print() {
        System.out.println(this.toString());
    }
}
