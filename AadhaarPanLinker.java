import java.util.*;

public class AadhaarPanLinker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter aadhaar Number");
        String aadhaarNum = in.nextLine();

        AadhaarService aadhaarService = new AadhaarService();
        PanService panService = new PanService();

        Aadhaar aadhaar = aadhaarService.getAadhaarCardNumber(aadhaarNum);
        Pan pan = panService.getPanByAadhaar(aadhaarNum);

        if(aadhaar != null && pan != null) {
            System.out.println("aadhaar details: " + aadhaar.toString() );
            System.out.println("Pan details: " + pan.toString());
        } else{
            System.out.println("Not-linked");
        }
    }
}
