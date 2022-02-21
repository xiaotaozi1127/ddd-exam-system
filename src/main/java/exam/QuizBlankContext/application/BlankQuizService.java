package exam.QuizBlankContext.application;

import exam.QuizBlankContext.domaim.model.BlankQuiz;
import exam.QuizBlankContext.domaim.model.BlankQuizId;
import exam.QuizBlankContext.domaim.model.BlankQuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlankQuizService {

    BlankQuizRepository blankQuizRepository;

    @Autowired
    BlankQuizService(BlankQuizRepository repo) {
        this.blankQuizRepository = repo;
    }

    public BlankQuiz find(BlankQuizId blankQuizId) {
        return blankQuizRepository.find(blankQuizId);
    }

    public String save(String content, int score){
        BlankQuizId blankQuizId = BlankQuizId.nextId();
        BlankQuiz quiz = BlankQuiz.create(blankQuizId, content, score);
        blankQuizRepository.save(quiz);
        return blankQuizId.toString();
    }

    public void update(BlankQuizId blankQuizId, BlankQuiz blankQuiz) {
        blankQuizRepository.update(blankQuizId, blankQuiz);
    }

    public void delete(BlankQuizId blankQuizId) {
        blankQuizRepository.delete(blankQuizId);
    }

    public List<BlankQuiz> findAll () {
        return blankQuizRepository.getAll();
    }
}
