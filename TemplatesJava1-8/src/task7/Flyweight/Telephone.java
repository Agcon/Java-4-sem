package task7.Flyweight;

public class Telephone {
    @SuppressWarnings("unused")

    private TelephoneTypes telephoneType;

    public Telephone(){
        System.out.println("New telephone created");
        this.telephoneType = TelephoneTypes.Apple;
    }

    public Telephone setTelephoneType(TelephoneTypes telephoneType){
        this.telephoneType = telephoneType;
        return this;
    }
}
