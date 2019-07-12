package builder;

public class PersonImprovedJobBuilder extends PersonImprovedBuilder{

    public PersonImprovedJobBuilder(PersonImproved personImproved){
        this.personImproved = personImproved;
    }

    public PersonImprovedJobBuilder at(String companyName){
        personImproved.companyName = companyName;
        return this;
    }

    public PersonImprovedJobBuilder asA(String position){
        personImproved.position = position;
        return this;
    }

    public PersonImprovedJobBuilder earns(int income){
        personImproved.annualIncome = income;
        return this;
    }
}
