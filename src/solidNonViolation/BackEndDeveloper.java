package solidNonViolation;

public class BackEndDeveloper extends Developer {  // Low level module 2

    @Override
    public void develop() {
        this.javaWrite();
    }

    public void javaWrite() {
        System.out.println("Use java for Backend Development");
    }
}
