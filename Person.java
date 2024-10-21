/**
   This class represents the cardholder
   and their personal information.
*/

public class Person 
{
    private String firstName;   // The cardholder's first name.
    private String lastName;    // The cardholder's last name.
    private Address address;    // The cardholder's current address.

    /**
       Constuctor
       @param first The first name.
       @param last  The last name.
       @param home  The address. 
    */
    public Person(String first, String last, Address home) 
    {
        firstName = first;
        lastName = last;
        address = home;
    }

    /**
       toString method to display the cardholder's first name,
       last name, and address.
       @return The formatted personal information
    */
    @Override
    public String toString() 
    {
        return firstName + " " + lastName + ", " + address.toString();
    }
}
