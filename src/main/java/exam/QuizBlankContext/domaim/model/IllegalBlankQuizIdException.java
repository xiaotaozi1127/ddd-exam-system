package exam.QuizBlankContext.domaim.model;

public class IllegalBlankQuizIdException extends IllegalArgumentException {
    public IllegalBlankQuizIdException(BlankQuizId blankQuizId) {
        super("IllegalBlankQuizId Exception: " + blankQuizId + "does not exist.");
    }
}
