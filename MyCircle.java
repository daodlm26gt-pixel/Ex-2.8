public class MyCircle {
    // Các thuộc tính private
    private MyPoint center = new MyPoint(0, 0); // Tọa độ tâm mặc định (0, 0)[cite: 2]
    private int radius = 1;                     // Bán kính mặc định = 1[cite: 2]

    // 1. Default constructor: tâm tại (0, 0) và bán kính = 1[cite: 2, 3]
    public MyCircle() {
        this.center = new MyPoint(0, 0);
        this.radius = 1;
    }

    // 2. Constructor với tọa độ tâm (x, y) và bán kính[cite: 2, 3]
    public MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }

    // 3. Constructor với đối tượng MyPoint và bán kính[cite: 2, 3]
    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    // Getter và Setter cho radius[cite: 2]
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    // Getter và Setter cho center[cite: 2]
    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    // Getter và Setter cho tọa độ X của center[cite: 2, 3]
    public int getCenterX() {
        return center.getX();
    }

    public void setCenterX(int x) {
        center.setX(x);
    }

    // Getter và Setter cho tọa độ Y của center[cite: 2]
    public int getCenterY() {
        return center.getY();
    }

    public void setCenterY(int y) {
        center.setY(y);
    }

    // Getter và Setter cho mảng chứa tọa độ [x, y] của center[cite: 2]
    public int[] getCenterXY() {
        return center.getXY();
    }

    public void setCenterXY(int x, int y) {
        center.setXY(x, y);
    }

    // Trả về chuỗi đại diện: "MyCircle[radius=r,center=(x,y)]"[cite: 2]
    @Override
    public String toString() {
        return "MyCircle[radius=" + radius + ",center=" + center.toString() + "]";
    }

    // Tính diện tích hình tròn[cite: 2]
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Tính chu vi hình tròn[cite: 2]
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // Tính khoảng cách giữa tâm của đường tròn này với đường tròn khác[cite: 2, 3]
    public double distance(MyCircle another) {
        return center.distance(another.center);
    }
}