package solidNonViolation;

public class FrontEndDeveloper extends Developer { // Low level Module1

    @Override
    public void develop() {
        this.javaScriptWrite();
    }

    public void javaScriptWrite() {
        System.out.println("Use javaScript for Frontend Development");
    }
}
