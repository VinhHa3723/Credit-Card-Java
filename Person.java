public class Person 
{
    private String firstName;
    private String lastName;
    private Address address;

    // Constructor to initialize the person's details
    public Person(String firstName, String lastName, Address address) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    // Overriding the toString method to display personal information
    @Override
    public String toString() 
    {
        return firstName + " " + lastName + ", " + address.toString();
    }
}
