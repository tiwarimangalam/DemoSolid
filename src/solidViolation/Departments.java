package solidViolation;

/*
2.    Open for extension and closed for modification Violation
 */
public class Departments {
    public void department(String dpt) {
        if (dpt == "IT") {
            System.out.println("This is IT labs");
        } else if (dpt == "ME") {
            System.out.println("This is ME labs");
        }
        /* In This we are modifying the class as per need which means Violation of Open for extension
         and closed for modification.
         */
    }
}
