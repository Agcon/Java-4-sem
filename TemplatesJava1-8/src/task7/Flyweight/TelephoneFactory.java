package task7.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class TelephoneFactory {
    private final Map<TelephoneTypes, Telephone> telephones = new HashMap<>();

    @SuppressWarnings("UnusedReturnValue")
    public Telephone createStar(TelephoneTypes telephoneType) {
        if (telephones.containsKey(telephoneType)) {
            return telephones.get(telephoneType);
        } else {
            Telephone telephone = new Telephone().setTelephoneType(telephoneType);
            telephones.put(telephoneType, telephone);
            return telephone;
        }
    }
}