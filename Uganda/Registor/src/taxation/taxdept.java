package taxation;

public class taxdept {
    public void payTax(taxinfo payer) {
        System.out.println("TIN " + payer.tin + " paid tax of UGX " + payer.amount);
    }
}
