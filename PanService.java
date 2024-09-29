import java.util.*;

public class PanService {
    private static Map<String, Pan> panMap= new HashMap<>();

    static {
        panMap.put("ABCDEFG123H4", new Pan("ABCDEFG123H4", "12345678",
                "HDFC BANK", "Stocks, FD, ELSS "));

        panMap.put("BCDEFGH234I5", new Pan("BCDEFGH234I5", "23456789",
                "SBI BANK", "Stock, FD"));

    }


    public Pan getPanByAadhaar(String aadhaarNum) { //getting pan-details based on Aadhaar Card

        for(Pan pan : panMap.values()) { //.values() ->gives iterator on values
            if(pan.getAadharNumber().equals(aadhaarNum)) {
                return pan;
            }
        }
        return null;
    }
}
