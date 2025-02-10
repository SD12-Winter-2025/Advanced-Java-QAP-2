public class MyPoint {
    private int x, y; // Private variables to store x and y coordinates

    // Constructor to initialize x and y
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Default constructor
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    // Getter for x
    public int getX() {
        return x;
    }

    // Setter for x
    public void setX(int x) {
        this.x = x;
    }

    // Getter for y
    public int getY() {
        return y;
    }

    // Setter for y
    public void setY(int y) {
        this.y = y;
    }

    // Method to calculate distance from this point to another point (x, y)
    public double distance(int x, int y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2)); // Calculate distance using Math class
    }

    // Method to calculate distance from this point to another MyPoint
    public double distance(MyPoint another) {
        return distance(another.getX(), another.getY()); // Use the distance method
    }

    // Override toString method to return a string representation of the point
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}