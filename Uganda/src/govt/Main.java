package govt;
import id.*;
import passport.*;
import business.*;
import taxation.*;

public class Main {
    public static void main(String[] args) {
        new IDdept().issueID(new IDinfo("Aisha Nakato", "CM1234567"));
        new passportservices().issuePassport(new passportdetails("Aisha Nakato", "B0012345"));

        new businessdept().registerBusiness(new businessinfo("Nakato Bakery", "Aisha Nakato"));
        new taxdept().payTax(new taxinfo("1000123456", 500000));
    }
}
