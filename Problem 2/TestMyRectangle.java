public class TestMyRectangle {
    public static void main(String[] args) {
        // Create a MyRectangle object using coordinates
        MyRectangle rect1 = new MyRectangle(1, 2, 3, 4);
        System.out.println(rect1);  // Print the rectangle

        // Create MyPoint objects
        MyPoint p1 = new MyPoint(5, 6);
        MyPoint p2 = new MyPoint(7, 8);

        // Create a MyRectangle object using MyPoint instances
        MyRectangle rect2 = new MyRectangle(p1, p2);
        System.out.println(rect2);  // Print the rectangle

        // Set new top-left and bottom-right corners for rect1
        rect1.setTopLeft(p1);
        rect1.setBottomRight(p2);
        System.out.println(rect1);  // Print the updated rectangle

        // Print the width, height, area, and perimeter of the rectangle
        System.out.println("Width: " + rect1.getWidth());        // Width of the rectangle
        System.out.println("Height: " + rect1.getHeight());      // Height of the rectangle
        System.out.println("Area: " + rect1.getArea());          // Area of the rectangle
        System.out.println("Perimeter: " + rect1.getPerimeter()); // Perimeter of the rectangle
    }
}