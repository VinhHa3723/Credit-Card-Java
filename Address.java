/**
   This class defines the address of 
   the owner of the credit card.
*/

public class Address 
{
    private String street;
    private String city;
    private String state;
    private String zip;

    /**
       The Address method
       @param street The street name.
	   @param city The city of owner.
       @param state The state of owner.
	   @param zip The zipcode of owner.
    */
    public Address(String street, String city, String state, String zip) 
    {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    // Overriding the toString method to display the address
    @Override
    public String toString() 
    {
        return street + ", " + city + ", " + state + " " + zip;
    }
}
