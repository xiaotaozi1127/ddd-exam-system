package exam.QuizBlankContext.domaim.model;

public class BlankQuizIdAlreadyExistException extends IllegalArgumentException {
    public BlankQuizIdAlreadyExistException(BlankQuizId blankQuizId) {
        super("BlankQuizIdAlreadyExist Exception: " + blankQuizId + "already exist.");
    }
}
