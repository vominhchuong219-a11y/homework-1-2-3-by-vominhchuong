package Lec08_ObjectsAndClasses.Exercise_7_Point_Coordinate_Class;

import java.util.Scanner;

  

    public class Point_Coordinate {

        private double x;
        private double y;

        public Point_Coordinate(double x, double y) {
            this.y = y;
        }

        public Point_Coordinate() {
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        public void setX(double x) {
            this.x = x;
        }

        public void setY(double y) {
            this.y = y;
        }

    public void enterInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x = ");
        double x = scanner.nextDouble();
        setX(x);
        System.out.print("y = ");
        setY(scanner.nextDouble());
    }
    public void disPlayInfo() {
        System.out.println("x=" + getX() + ", y=" + getY() + ", distance from O=" + distanceFromOrigin());
    }
    public double distanceFromOrigin(){
        return Math.sqrt(x * x + y * y);
    }
}
