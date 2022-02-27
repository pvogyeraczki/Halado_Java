package Point;

public class Point {
    private int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /*public Point(Point p) {
        this.x = p.getX();
        this.y = p.getY();
    }*/

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int setX(int x) {
        return this.x = x;
    }

    public int setY(int y) {
        return this.y = y;
    }

    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    public void move(Point p) {
        this.x += p.getX();
        this.y += p.getY();
    }
}
