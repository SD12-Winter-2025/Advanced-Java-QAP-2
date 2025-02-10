public class CreditCard {
    private final Person owner;
    private Money balance;
    private final Money creditLimit;

    // Constructor
    public CreditCard(Person newCardHolder, Money limit) {
        this.owner = newCardHolder;
        this.creditLimit = new Money(limit); // Using copy constructor
        this.balance = new Money(0); // Initializing balance to zero
    }

    // Accessor method to get the balance
    public Money getBalance() {
        return new Money(this.balance); // Returning a copy of the balance
    }

    // Accessor method to get the credit limit
    public Money getCreditLimit() {
        return new Money(this.creditLimit); // Returning a copy of the credit limit
    }

    // Accessor method to get the owner's information
    public String getPersonals() {
        return this.owner.toString();
    }

    // Method to charge an amount to the credit card
    public void charge(Money amount) {
        Money newBalance = this.balance.add(amount);
        if (newBalance.compareTo(this.creditLimit) <= 0) {
            this.balance = newBalance;
            System.out.println("Charge: " + amount);
        } else {
            System.out.println("Exceeds credit limit");
        }
    }

    // Method to make a payment on the credit card
    public void payment(Money amount) {
        long newDollars = this.balance.getDollars() - amount.getDollars();
        long newCents = this.balance.getCents() - amount.getCents();

        // Adjust for negative cents
        if (newCents < 0) {
            newDollars -= 1;
            newCents += 100;
        }

        if (newDollars < 0) {
            throw new IllegalArgumentException("Payment exceeds balance");
        }

        this.balance = new Money(newDollars, newCents);
        System.out.println("Payment: " + amount);
    }
}