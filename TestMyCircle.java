import java.util.Arrays;

public class TestMyCircle {
    public static void main(String[] args) {
        // Kiểm thử các Constructor[cite: 2]
        MyCircle c1 = new MyCircle();
        System.out.println("c1 (default): " + c1); // MyCircle[radius=1,center=(0,0)][cite: 2]

        MyCircle c2 = new MyCircle(3, 4, 5);
        System.out.println("c2: " + c2); // MyCircle[radius=5,center=(3,4)][cite: 2]

        MyPoint p1 = new MyPoint(6, 8);
        MyCircle c3 = new MyCircle(p1, 10);
        System.out.println("c3: " + c3); // MyCircle[radius=10,center=(6,8)][cite: 2]

        // Kiểm thử các Getter và Setter[cite: 2]
        c1.setRadius(2);
        c1.setCenterX(1);
        c1.setCenterY(1);
        System.out.println("\nSau khi thay doi c1:");
        System.out.println(c1);
        System.out.println("Radius c1: " + c1.getRadius());
        System.out.println("Center X c1: " + c1.getCenterX() + ", Center Y c1: " + c1.getCenterY());

        c1.setCenterXY(0, 0);
        System.out.println("Center XY c1: " + Arrays.toString(c1.getCenterXY()));

        // Kiểm thử getArea() và getCircumference()[cite: 2]
        System.out.printf("\nDien tich c2: %.2f%n", c2.getArea());
        System.out.printf("Chu vi c2: %.2f%n", c2.getCircumference());

        // Kiểm thử phương thức distance() giữa 2 hình tròn (tính khoảng cách 2 tâm)[cite: 2, 3]
        // Khoảng cách từ (0,0) tới (3,4) là 5.0
        System.out.printf("Khoang cach giua tam c1 va c2: %.2f%n", c1.distance(c2));
    }
}