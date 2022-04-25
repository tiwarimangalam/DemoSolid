package solidNonViolation;

public class RegistrarOffice implements UpdateFeeAndContactDetails {

    @Override
    public void feeUpdate() {
        System.out.println("Update the fee details");
    }

    @Override
    public void contactDetailsUpdate() {
        System.out.println("Update the contact details");
    }
}
