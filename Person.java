/**
   This class represents the owner of the card
   and his personal information.
*/

public class Person 
{
    private String firstName;
    private String lastName;
    private Address address;

    /**
       Constuctor
       @param firstName 
       @param lastName 
       @param address 
    */
    public Person(String firstName, String lastName, Address address) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    @Override
    public String toString() 
    {
        return firstName + " " + lastName + ", " + address.toString();
    }
}
