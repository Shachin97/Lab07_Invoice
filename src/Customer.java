public class Customer extends Address
{
    private String name;



    public Customer(String street, String city, String state, String zipcode, String name) {
        super(street, city, state, zipcode);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}
