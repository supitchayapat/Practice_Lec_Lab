package product;

public class Address {
    private String name;
    private String street;
    private String city;
    private String zip;

    public Address(String name, String street, String city, String zip) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.zip = zip;
    }

    public String format(){
        return name + "\n" +street +", " + city +", "+zip;
    }
}
