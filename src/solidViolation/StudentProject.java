package solidViolation;

// 5.  Dependency Inversion Violation
/*
High level module/classes shouldn't be dependent on low level module/classes.
Both should depend on abstraction.
and also abstraction shouldn't depend upon details.
Details should depend upon abstraction.
 */
public class StudentProject {
    BackEndDeveloper bed = new BackEndDeveloper();
    FrontEndDeveloper fed = new FrontEndDeveloper();

    /*
    Here we are violating the dependency inversion principle because high level module StudentProject is dependent
    on low level module BackEndDeveloper and FrontEndDeveloper.
     */
    public void implement() {
        bed.javaWrite();
        fed.javaScriptWrite();
    }
}
