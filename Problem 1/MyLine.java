public class MyLine {
    private MyPoint begin, end; // Private variables to store the begin and end points

    // Constructor to initialize the line with coordinates
    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1); // Create a new MyPoint for the begin point
        this.end = new MyPoint(x2, y2);   // Create a new MyPoint for the end point
    }

    // Constructor to initialize the line with MyPoint instances
    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    // Getter for the begin point
    public MyPoint getBegin() {
        return begin;
    }

    // Setter for the begin point
    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    // Getter for the end point
    public MyPoint getEnd() {
        return end;
    }

    // Setter for the end point
    public void setEnd(MyPoint end) {
        this.end = end;
    }

    // Getter for the x-coordinate of the begin point
    public int getBeginX() {
        return begin.getX();
    }

    // Setter for the x-coordinate of the begin point
    public void setBeginX(int x) {
        begin.setX(x);
    }

    // Getter for the y-coordinate of the begin point
    public int getBeginY() {
        return begin.getY();
    }

    // Setter for the y-coordinate of the begin point
    public void setBeginY(int y) {
        begin.setY(y);
    }

    // Getter for the x-coordinate of the end point
    public int getEndX() {
        return end.getX();
    }

    // Setter for the x-coordinate of the end point
    public void setEndX(int x) {
        end.setX(x);
    }

    // Getter for the y-coordinate of the end point
    public int getEndY() {
        return end.getY();
    }

    // Setter for the y-coordinate of the end point
    public void setEndY(int y) {
        end.setY(y);
    }

    // Getter for the coordinates of the begin point as an array
    public int[] getBeginXY() {
        return new int[]{begin.getX(), begin.getY()};
    }

    // Setter for the coordinates of the begin point
    public void setBeginXY(int x, int y) {
        begin.setX(x);
        begin.setY(y);
    }

    // Getter for the coordinates of the end point as an array
    public int[] getEndXY() {
        return new int[]{end.getX(), end.getY()};
    }

    // Setter for the coordinates of the end point
    public void setEndXY(int x, int y) {
        end.setX(x);
        end.setY(y);
    }

    // Method to calculate the length of the line using the distance method from MyPoint
    public double getLength() {
        return begin.distance(end);
    }

    // Method to calculate the gradient of the line in radians
    public double getGradient() {
        return Math.atan2(end.getY() - begin.getY(), end.getX() - begin.getX());
    }

    // Override toString method to return a string representation of the line
    @Override
    public String toString() {
        return "MyLine[begin=" + begin + ", end=" + end + "]";
    }
}