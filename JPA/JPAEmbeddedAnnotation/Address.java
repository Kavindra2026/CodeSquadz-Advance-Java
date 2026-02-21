package mypack;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address
{
    private String street;
    private String city;
    private String state;
    private String zipcode;

    public Address()
    {
    }

    public Address(String street, String city, String state, String zipcode)
    {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    @Column(name="ADDRESS_STREET", nullable=false, length=250)
    public String getStreet()
    {
        return street;
    }

    public void setStreet(String street)
    {
        this.street = street;
    }

    @Column(name="ADDRESS_CITY", nullable=false, length=50)
    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    @Column(name="ADDRESS_STATE", nullable=false, length=50)
    public String getState()
    {
        return state;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    @Column(name="ADDRESS_ZIPCODE", nullable=false, length=10)
    public String getZipcode()
    {
        return zipcode;
    }

    public void setZipcode(String zipcode)
    {
        this.zipcode = zipcode;
    }
}
/*Short Explanation

@Embeddable → separate table nahi banti

Fields owner entity ke table me store hote hain */