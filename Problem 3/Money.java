public class Money {
    private long dollars;
    private long cents;

    // Constructor that takes a double amount
    public Money(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        this.dollars = (long) amount;
        this.cents = Math.round((amount - this.dollars) * 100);
    }

    // Constructor that takes dollars and cents
    public Money(long dollars, long cents) {
        if (dollars < 0 || cents < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        this.dollars = dollars;
        this.cents = cents;
    }

    // Copy constructor
    public Money(Money otherObject) {
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }

    // Method to add two Money objects
    public Money add(Money otherAmount) {
        long totalCents = this.cents + otherAmount.cents;
        long totalDollars = this.dollars + otherAmount.dollars + totalCents / 100;
        totalCents = totalCents % 100;
        return new Money(totalDollars, totalCents);
    }

    // compareTo method
    public int compareTo(Money otherObject) {
        if (this.dollars > otherObject.dollars) {
            return 1;
        } else if (this.dollars < otherObject.dollars) {
            return -1;
        } else {
            return Long.compare(this.cents, otherObject.cents);
        }
    }

    // equals method
    public boolean equals(Money otherObject) {
        return this.dollars == otherObject.dollars && this.cents == otherObject.cents;
    }

    // toString method
    @Override
    public String toString() {
        return "$" + this.dollars + "." + String.format("%02d", this.cents);
    }

    // Getter methods for dollars and cents
    public long getDollars() {
        return this.dollars;
    }

    public long getCents() {
        return this.cents;
    }
}