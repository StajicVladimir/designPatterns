package builder;

public class PersonAddressImprovedBuilder extends PersonImprovedBuilder {
    public PersonAddressImprovedBuilder(PersonImproved personImproved){
        this.personImproved = personImproved;
    }

    public PersonAddressImprovedBuilder at(String streetAddress){
        personImproved.streetAddress = streetAddress;
        return this;
    }

    public PersonAddressImprovedBuilder withPostcode(String postCode){
        personImproved.postcode = postCode;
        return this;
    }

    public PersonAddressImprovedBuilder in(String city){
        personImproved.city = city;
        return this;
    }
}
