public class Money 
{
    private double amount;

    // Constructor to initialize the amount
    public Money(double amount) 
    {
        this.amount = amount;
    }

    // Copy constructor
    public Money(Money other) 
    {
        this.amount = other.amount;
    }

    // Method to add two Money objects
    public Money add(Money other) 
    {
        return new Money(this.amount + other.amount);
    }

    // Method to subtract two Money objects
    public Money subtract(Money other) 
    {
        return new Money(this.amount - other.amount);
    }

    // Method to compare two Money objects
    public int compareTo(Money other) 
    {
        if (this.amount < other.amount) 
        {
            return -1;
        } 
        else if (this.amount > other.amount) 
        {
            return 1;
        } 
        else 
        {
            return 0;
        }
    }

    // Overriding the toString method to display monetary values
    @Override
    public String toString() 
    {
        return String.format("$%.2f", this.amount);
    }
}
