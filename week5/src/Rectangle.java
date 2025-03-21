public class Rectangle {
    private int sideA, sideB;
    private Point topLeft;

    public Rectangle(int sideA, int sideB, Point topLeft) {
        setSideA(sideA);
        setSideB(sideB);
        this.topLeft = topLeft;
    }

    public Rectangle(int sideA, Point topLeft) {
        this.sideA = sideA;
        this.sideB = sideA;
        this.topLeft = topLeft;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        if(sideA < 0){
            this.sideA = 0;
            System.out.println("Side A cannot be negative!");
        }
        else this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if(sideB < 0){
            this.sideB = 0;
            System.out.println("Side B cannot be negative!");
        }
        else this.sideB = sideB;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public int perimeter(){
        return 2*(this.sideA+this.sideB);
    }
    public int area(){
        return this.sideB * this.sideA;
    }
}
