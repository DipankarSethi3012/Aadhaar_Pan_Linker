import java.util.*;

public class AadhaarService {
    private static final Map<String, Aadhaar> mp = new HashMap<>();
    //static-block is executed only once when class is loaded and used fof initilization of static member of class
    //cant use directly it for accessing non-static members
    static {
        mp.put("12345678", new Aadhaar("12345678", "abcd", "defg", "malout"));
        mp.put("23456789", new Aadhaar("23456789", "bcde", "efgh", "Malout"));
    }

    //we can access non-static members of class in static block  by creating an object of class and using it to
    //reference of the instance members

    public Aadhaar getAadhaarCardNumber(String aadhaarNum){
        return mp.get(aadhaarNum);
    }

}
