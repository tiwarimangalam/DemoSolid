package solidNonViolation;

public class SolidNonViolation {
    public static void main(String[] args)
    {
        System.out.println("This section will implement the Solid principles");
        System.out.println("1: This is for SOLID's Single Responsibility=>");
        Student std=new Student();
        std.updateDetails();
        System.out.println("2: This is for SOLID's Open for Extension and closed for modification=>");
        Departments dpt=new ItDepartment();
        dpt.departmentLabs();
        System.out.println("3: This is for SOLID's Liskov Substitution=>");
        Teacher t=new Teacher();
        t.setQuiz();
        System.out.println("4: This is for SOLID's Interface Segregation=>");
        RegistrarOffice rgo=new RegistrarOffice();
        rgo.feeUpdate();
        System.out.println("5: This is for SOLID's Dependency Inversion=>");
        StudentProject sp=new StudentProject();
        BackEndDeveloper bed=new BackEndDeveloper();
        sp.implement(bed);
    }
}
