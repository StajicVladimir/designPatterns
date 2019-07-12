package builder;

//Builder Facade
public class PersonImprovedBuilder {
    protected PersonImproved personImproved = new PersonImproved();


    public PersonAddressImprovedBuilder lives(){
        return new PersonAddressImprovedBuilder(personImproved);
    }

    public PersonImprovedJobBuilder works(){
        return new PersonImprovedJobBuilder(personImproved);
    }

    public PersonImproved build(){
        return personImproved;
    }
}
