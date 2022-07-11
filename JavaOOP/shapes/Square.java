package shapes;

public class Square extends Shape {

    private int size;

    public Square(int size, char color) {
        super(color);
        this.size = size;
    }

    public Square(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < size; i++) {
            s += super.color;
        }
        return s;
    }

    @Override
    public void print() {
        for (int i = 0; i < this.size; i++) {
            System.out.println(this.toString());
        }
    }
}
