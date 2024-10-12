/**
   This class defines a credit card by balance, 
   credit limit, and owner.
*/

public class CreditCard
{
	private Money balance;
	private Money creditLimit;
	private Person owner;
	
	/**
           The CreditCard method
           @param newCardHolder The owner of the card.
	   @param limit The credit limit of the card.
        */
	public CreditCard(Person newCardHolder, Money limit)
	{
		creditLimit = limit;	
		owner = newCardHolder;	
		balance = new Money(0); 
	}
	
	/**
           The getBalance method
           @return The balance of the card
        */
	public Money getBalance()
	{
		return new Money(balance);
	}
	
	/**
           The getCreditLimit method
           @return The credit limit of the card
        */
	public Money getCreditLimit()
	{
		return new Money(creditLimit);
	}
	
	/**
           The getPersonals method
           @return The personal information of the owner
        */
	public String getPersonals()
	{
		return owner.toString();
	}
	
	/**
           The charge method
           @param amount The amount of money spent
        */
	public void charge(Money amount)
	{
		if (balance.add(amount).compareTo(creditLimit) < 0)
		{
			System.out.println("Charge: " + amount);
			balance = balance.add(amount);
		}
		else 
		{
			System.out.println("Exceeds credit limit.");
		}
	}
	
	/**
           The payment method
           @param amount The amount of money that was paid 
        */
	public void payment(Money amount)
	{
		System.out.println("Payment: " + amount);
		balance = balance.subtract(amount);
	}
}
