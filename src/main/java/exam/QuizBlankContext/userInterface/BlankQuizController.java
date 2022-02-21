package exam.QuizBlankContext.userInterface;

import exam.QuizBlankContext.application.BlankQuizService;
import exam.QuizBlankContext.domaim.model.BlankQuiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BlankQuizController {

    private final BlankQuizService blankQuizService;

    @Autowired
    public BlankQuizController(BlankQuizService blankQuizService) {
        this.blankQuizService = blankQuizService;
    }

    @PostMapping("/blankQuiz")
    String createBlankQuiz(@RequestBody BlankQuizDto blankQuizDto) {
        return blankQuizService.save(blankQuizDto.content, blankQuizDto.score);
    }

    @GetMapping("/blankQuiz")
    List<BlankQuiz> getAllBlankQuiz() {
        return blankQuizService.findAll();
    }
}
