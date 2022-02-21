package exam.QuizBlankContext.infastructure;

import exam.QuizBlankContext.domaim.model.*;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MemoryBlankQuizRepository implements BlankQuizRepository {

    List<BlankQuiz> blankQuizList = new ArrayList<>();

    @Override
    public BlankQuiz find(BlankQuizId blankQuizId) {
        BlankQuiz find = blankQuizList.stream().filter(item -> item.getBlankQuizId().sameValueAs(blankQuizId)).findFirst().orElse(null);
        if (find != null) {
            return find;
        } else {
            throw new IllegalBlankQuizIdException(blankQuizId);
        }
    }

    @Override
    public void save(BlankQuiz blankQuiz) {
        BlankQuiz find = blankQuizList.stream()
                .filter(item -> item.getBlankQuizId().sameValueAs(blankQuiz.getBlankQuizId()))
                .findFirst().orElse(null);
        if (find != null) {
            throw new BlankQuizIdAlreadyExistException(blankQuiz.getBlankQuizId());
        }
        blankQuizList.add(blankQuiz);
    }

    @Override
    public void update(BlankQuizId blankQuizId, BlankQuiz blankQuiz) {
        BlankQuiz updated = blankQuizList.stream().filter(item -> item.getBlankQuizId().sameValueAs(blankQuizId)).findFirst().orElse(null);
        updated.setContent(blankQuiz.getContent());
        updated.setScore(blankQuiz.getScore());
    }

    @Override
    public void delete(BlankQuizId blankQuizId) {
        BlankQuiz blankQuiz = blankQuizList.stream().filter(item -> item.getBlankQuizId().sameValueAs(blankQuizId)).findFirst().orElse(null);
        if (blankQuiz != null) {
            blankQuizList.remove(blankQuiz);
        } else {
            throw new IllegalBlankQuizIdException(blankQuizId);
        }

    }

    @Override
    public List<BlankQuiz> getAll() {
        return blankQuizList;
    }
}
