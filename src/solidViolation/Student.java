package solidViolation;

/*
   1.    Single Responsibility Violation
    */
public class Student {
    public void verifyDetails() {
        System.out.println("Verify the Student Details");
    }

    public void updateDetails() {
        System.out.println("Update the student details");
    }
    /*
    This is the violation of Single Responsibility principle.
    Because we are performing two functionality verifyDetails and updateDetails in a single class.
     */
}
