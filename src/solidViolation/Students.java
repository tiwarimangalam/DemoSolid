package solidViolation;

public class Students extends Quiz {
    public void setQuiz() {
        System.out.println("Can't set the quiz");
        //throw new RuntimeException("Not Substitutable");
    }

    @Override
    public void attemptQuiz() {
        System.out.println("Attempt the quiz");
    }
        /*
        Here parent class "Quiz" is not completely substitutable by its child class "Students"
         */
}
