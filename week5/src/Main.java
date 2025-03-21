import org.w3c.dom.css.Rect;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point();
        System.out.println(p1.x);
        System.out.println(p1.y);

        Point p2 = new Point(3,4);
        System.out.println(p2.x);
        System.out.println(p2.y);

        Point p3 = new Point(5);
        System.out.println(p3.x);
        System.out.println(p3.y);

        Rectangle r1 = new Rectangle(4,5, new Point(3));
        System.out.println(r1.getSideA());
        System.out.println(r1.getSideB());
        System.out.println(r1.getTopLeft().x);
        System.out.println(r1.getTopLeft().y);

        System.out.println(r1.perimeter());
        System.out.println(r1.area());
    }
}