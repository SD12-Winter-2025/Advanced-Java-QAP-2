public class TestMyLine {
    public static void main(String[] args) {
        // Create a MyLine object using coordinates
        MyLine line1 = new MyLine(1, 2, 3, 4);
        System.out.println(line1);  // Print the line

        // Create MyPoint objects
        MyPoint p1 = new MyPoint(5, 6);
        MyPoint p2 = new MyPoint(7, 8);

        // Create a MyLine object using MyPoint instances
        MyLine line2 = new MyLine(p1, p2);
        System.out.println(line2);  // Print the line

        // Set new begin and end points for line1
        line1.setBegin(p1);
        line1.setEnd(p2);
        System.out.println(line1);  // Print the updated line

        // Print the x and y coordinates of the begin and end points
        System.out.println("Begin X: " + line1.getBeginX());  // 5
        System.out.println("Begin Y: " + line1.getBeginY());  // 6
        System.out.println("End X: " + line1.getEndX());      // 7
        System.out.println("End Y: " + line1.getEndY());      // 8

        // Set new coordinates for the begin and end points
        line1.setBeginXY(9, 10);
        line1.setEndXY(11, 12);
        System.out.println(line1);  // Print the updated line

        // Print the length and gradient of the line
        System.out.println("Length: " + line1.getLength());  // Distance between (9,10) and (11,12)
        System.out.println("Gradient: " + line1.getGradient());  // Gradient in radians
    }
}