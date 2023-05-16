package io.codelex.classesandobjects.practice;

public class Points {
    private int x;
    private int y;


    public Points(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Points swapPoints(Points p1, Points p2) {
        int tempX = p1.x;
        p1.x = p2.x;
        p2.x = tempX;
        int tempY = p1.y;
        p1.y = p2.y;
        p2.y = tempY;
        Points result = p1 = p2;
        return result;
    }

    public static void main(String[] args) {
        Points p1 = new Points(5, 2);
        Points p2 = new Points(-3, 6);
        swapPoints(p1, p2);
        System.out.println("(" + p1.x + ", " + p1.y + ")");
        System.out.println("(" + p2.x + ", " + p2.y + ")");
    }
}
