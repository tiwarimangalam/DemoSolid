package solidNonViolation;

// 4.    Interface Segregation
public interface UpdateFeeAndContactDetails { // 1st interface
    public void feeUpdate();
    public void contactDetailsUpdate();
    /*
    Segregated the interfaces into two parts UpdateFeeAndContactDetails and UpdateAttendance
     */
}
