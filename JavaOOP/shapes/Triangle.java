package shapes;

public class Triangle extends Shape {

    private int height;

    public Triangle(int height, char color) {
        super(color);
        this.height = height;
    }

    public Triangle(int height) {
        this.height = height;
    }

    public int getSize() {
        return height;
    }

    public void setSize(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < height; i++) {
            s += super.color;
        }
        return s;
    }

    @Override
    public void print() {
        String s = "";
        for (int i = 0; i < height; i++) {
            s += super.color;
            System.out.println(s);
        }
    }
}
