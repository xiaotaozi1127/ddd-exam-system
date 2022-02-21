package exam.QuizBlankContext.domaim.model;

import java.util.List;

public interface BlankQuizRepository {
    BlankQuiz find(BlankQuizId blankQuizId);

    void save(BlankQuiz blankQuiz);

    void update(BlankQuizId blankQuizId, BlankQuiz blankQuiz);

    void delete(BlankQuizId blankQuizId);

    List<BlankQuiz> getAll();
}
