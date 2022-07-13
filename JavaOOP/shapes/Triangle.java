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

        StringBuilder sb = new StringBuilder();


        int k = 1;
        while (k<10) {
            for (int i = 0; i < height ; i++) {
                for (int j = 0; j < k; j++) {
                    sb.append(this.color).append(" ");
                }
                sb.append("\n");
            }
            return sb.toString();
        }
        return null;
    }

    @Override
    public void print() {
        System.out.println(this.toString());
    }
}
