/**
   This class represents the different dollar amount on the card.
*/
public class Money 
{
    private double amount;

    /**
       The Money method
       @param amount
    */
    public Money(double amount) 
    {
        this.amount = amount;
    }

    /**
       Copy constructor
       @param other Another dollar amount
    */
    public Money(Money other) 
    {
        this.amount = other.amount;
    }

    /**
       The add method
       @param other Another dollar amount
       @return The new balance of the card
    */
    public Money add(Money other) 
    {
        return new Money(this.amount + other.amount);
    }

    /**
       The subtract method
       @param other Another dollar amount
       @return The new balance of the card
    */
    public Money subtract(Money other) 
    {
        return new Money(this.amount - other.amount);
    }

    /**
       The compareTo method
       @param other Another dollar amount
       @return -1,1,0
    */
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
