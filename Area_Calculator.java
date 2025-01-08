public class Area_Calculator {

    // calculate area of a rectangle
    public static double calculateArea(double length, double width) {
        return length * width;
    }

    // calculate area of a triangle
    public static double calculateArea(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return 0.5 * base * height;
        }
        return 0.0; 
    }

    // Mcalculate area of a square
    public static double calculateArea(double side) {
        return side * side;
    }

    public static void main(String[] args) {
        // Calculate and display area of a rectangle
        double rectangleLength = 5.0;
        double rectangleWidth = 4.0;
        System.out.println("Area of Rectangle: " + calculateArea(rectangleLength, rectangleWidth));

        // Calculate and display area of a triangle
        double triangleBase = 6.0;
        double triangleHeight = 3.0;
        System.out.println("Area of Triangle: " + calculateArea(triangleBase, triangleHeight, true));

        // Calculate and display area of a square
        double squareSide = 4.0;
        System.out.println("Area of Square: " + calculateArea(squareSide));
    }
}
